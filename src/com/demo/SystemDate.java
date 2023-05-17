package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        //大写H表示24小时制，小写h表示12小时制
    }
}
