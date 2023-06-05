package com.example.springbootfoo.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.type.CollectionType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.List;

@Slf4j
public class JacksonUtil {
    private static final ObjectMapper objectmapper = new ObjectMapper();
    static {
        objectmapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
        objectmapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);

        objectmapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER,true);
        objectmapper.configure(JsonParser.Feature.ALLOW_COMMENTS,true);
        objectmapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES,true);
        objectmapper.configure(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS,true);
        objectmapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);

        objectmapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES,false);
        objectmapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);




    }

    public static String parseObjectToString(Object object) throws JsonProcessingException {
        return objectmapper.writeValueAsString(object);
    }


    public static <T> T parseObject(String json,Class<T> tClass) throws IOException {
        return objectmapper.readValue(json,tClass);
    }


    public static <T> T parseObjectWithOutException(String json,Class<T> tClass) {
        try {
            return objectmapper.readValue(json, tClass);
        }catch (Exception e){
            log.error("parseObjectWithOutException exception=",e);
        }
        return null;
    }

    public static <T> List<T> parseArrayObject(String json, Class<T> tClass) throws IOException {
        CollectionType javaType = objectmapper.getTypeFactory().constructCollectionType(List.class, tClass);
        return objectmapper.readValue(json,javaType);
    }

    public static <T> T string2Obj(String str, TypeReference<T> typeReference) {
        if (StringUtils.isEmpty(str) || typeReference == null) {
            return null;
        }
        try {
            return (T) (typeReference.getType().equals(String.class) ? str : objectmapper.readValue(str, typeReference));
        } catch (IOException e) {
            log.warn("Parse String to Object error", e);
            return null;
        }
    }

    public static <T> String obj2String(T obj) {
        if (obj == null) {
            return null;
        }
        try {
            return obj instanceof String ? (String) obj : objectmapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            log.warn("Parse Object to String error : {}", e.getMessage());
            return null;
        }
    }

}
