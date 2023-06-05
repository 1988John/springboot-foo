package com.example.springbootfoo.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ServiceA {
    public static void main(String[] args) {
        String attachmentStr = "[{\"fileUrl\":\"https://sf0-sign-boei18n.bytedance.net/ies-fe-csp-private-i18n/upload_0d23fedc5fb1d59b1f7d959683a577b6.jpg?x-orig-authkey=boeorigin&x-orig-expires=1701085928&x-orig-sign=jtlxfWG7V8Jb0ldx0ziZX4DAIDI%3D\",\"fileName\":\"2153816023113924608 copy.jpg\",\"fileSize\":535028,\"fileType\":\"image/jpeg\",\"contentId\":\"\",\"uri\":\"ies-fe-csp-private-i18n/upload_0d23fedc5fb1d59b1f7d959683a577b6.jpg\"}]";
        try {
            List<TicketAttachment> ticketAttachments = JacksonUtil.parseArrayObject(attachmentStr, TicketAttachment.class);
            System.out.println(ticketAttachments);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
