package com.ssm.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by thinkpad on 2017-01-12.
 */
public class Md5Utils {

    public Md5Utils() {
    }

    public static final String md5(String data) {
        MessageDigest digest = null;
        if(digest == null) {
            try {
                digest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException var3) {
             //   log.error("Failed to load the MD5 MessageDigest.");
                var3.printStackTrace();
            }
        }

        digest.update(data.getBytes());
        return encodeHex(digest.digest());
    }

    public static final String encodeHex(byte[] bytes) {
        StringBuffer buf = new StringBuffer(bytes.length * 2);

        for(int i = 0; i < bytes.length; ++i) {
            if((bytes[i] & 255) < 16) {
                buf.append("0");
            }

            buf.append(Long.toString((long)(bytes[i] & 255), 16));
        }

        return buf.toString();
    }
}

