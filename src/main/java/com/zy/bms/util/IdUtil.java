/*
 * Copyright (c) 2017 <l_iupeiyu@qq.com> All rights reserved.
 */

package com.zy.bms.util;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.tomcat.util.codec.binary.Base64;

import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * ID工具类
 * author growingbuds
 * date 2016/11/23 0023 下午 14:53
 */
public class IdUtil {
    public static String uuid() {
        return uuid16();
    }

    public static String uuid64() {
        UUID uuid = UUID.randomUUID();
        ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
        bb.putLong(uuid.getMostSignificantBits());
        bb.putLong(uuid.getLeastSignificantBits());
        return Base64.encodeBase64URLSafeString(bb.array());
    }

    public static String uuid16() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replaceAll("-", "").toLowerCase();
    }

    public static String randomNumeric(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    public static String randomAlphabetic(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    public static String randomAlphanumeric(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    synchronized public static String timeId() {
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyyMMddHHmmssSSS").format(System.currentTimeMillis()));
        sb.append(randomNumeric(5));
        return sb.toString();
    }
}
