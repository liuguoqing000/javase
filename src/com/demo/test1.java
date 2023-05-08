package com.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println(sdf.format(date));
        //大写H表示24小时制，小写h表示12小时制

    }
}

class test2 {
    public int i = 100;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int sum() {
        return 100;
    }
}

class test3 extends test2 {
    public int i = 200;
    public int j = 300;
    public int k = 300;
    public int h = 300;

    @Override
    public int sum() {
        return 200;
    }
}