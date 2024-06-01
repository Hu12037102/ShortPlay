package com.inshort.base.utils;
/*
 * Copyright (C) 2010-2018 Alibaba Group Holding Limited.
 */

/**
 * 时间格式化工具类
 */
public class TimeFormater {

    /**
     * 格式化毫秒数为 xx:xx:xx这样的时间格式。
     *
     * @param ms 毫秒数
     * @return 格式化后的字符串
     */
    public static String formatMs(long ms) {
        int seconds = (int) (ms / 1000);
        int finalSec = seconds % 60;
        int finalMin = seconds / 60 % 60;
        int finalHour = seconds / 3600;

        StringBuilder msBuilder = new StringBuilder("");
        if (finalHour > 9) {
            msBuilder.append(finalHour).append(":");
        } else if (finalHour > 0) {
            msBuilder.append("0").append(finalHour).append(":");
        }

        if (finalMin > 9) {
            msBuilder.append(finalMin).append(":");
        } else if (finalMin > 0) {
            msBuilder.append("0").append(finalMin).append(":");
        } else {
            msBuilder.append("00").append(":");
        }

        if (finalSec > 9) {
            msBuilder.append(finalSec);
        } else if (finalSec > 0) {
            msBuilder.append("0").append(finalSec);
        } else {
            msBuilder.append("00");
        }

        return msBuilder.toString();
    }

    /**
     * 秒
     * @param ms
     * @return
     */
    public static String finalSec(long ms){
        StringBuilder msBuilder = new StringBuilder("");
        int seconds = (int) (ms / 1000);
        int finalSec = seconds % 60;
        if (finalSec > 9) {
            msBuilder.append(finalSec);
        } else if (finalSec > 0) {
            msBuilder.append("0").append(finalSec);
        } else {
            msBuilder.append("00");
        }
        return msBuilder.toString();
    }

    /**
     * 分钟
     * @param ms
     * @return
     */
    public static String finalMin(long ms){
        StringBuilder msBuilder = new StringBuilder("");
        int seconds = (int) (ms / 1000);
        int finalMin = seconds / 60 % 60;
        if (finalMin > 9) {
            msBuilder.append(finalMin);
        } else if (finalMin > 0) {
            msBuilder.append("0").append(finalMin);
        } else {
            msBuilder.append("00");
        }
        return msBuilder.toString();
    }

    /**
     * 小时
     * @param ms
     * @return
     */
    public static String finalHour(long ms){
        StringBuilder msBuilder = new StringBuilder("");
        int seconds = (int) (ms / 1000);
        int finalHour = seconds / 3600;
        if (finalHour > 9) {
            msBuilder.append(finalHour);
        } else if (finalHour > 0) {
            msBuilder.append("0").append(finalHour);
        }else {
            msBuilder.append("00");
        }
        return msBuilder.toString();
    }

}
