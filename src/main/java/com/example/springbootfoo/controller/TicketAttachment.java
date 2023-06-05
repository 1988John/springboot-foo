package com.example.springbootfoo.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

/**
 * Created by lihuai
 * 2020/10/27 3:02 下午
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@ToString
public class TicketAttachment {
    @JsonProperty("fileName")
    private String fileName;
    @JsonProperty("fileUrl")
    private String fileUrl;
    @JsonProperty("FileSize")
    private String fileSize;
    @JsonProperty("FileType")
    private String fileType;

    @JsonProperty("FileId")
    private String fileId;

    @JsonProperty("Height")
    private String height;
    @JsonProperty("Width")
    private String width;

    @JsonProperty("Id")
    private String id;
    @JsonProperty("PostUrl")
    private String postUrl;

    @JsonProperty("FileUri")
    private String fileUri;

    @JsonProperty("Uri")
    private String uri;

    @JsonProperty("Tosbucket")
    private String tosBucket;

    @JsonProperty("FileSource")
    private String fileSource;

    @JsonProperty("Duration")
    private String duration;
}
