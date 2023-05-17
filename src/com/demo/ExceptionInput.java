package com.demo;

import java.util.Scanner;

public class ExceptionInput {
    public static void main(String[] args) {
        Input.method();
    }
}

class Input {
    public static void method() {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.print("请输入整数：");
            try {
                str = sc.next();
                System.out.println("你输入的数是：" + Integer.parseInt(str));
                break;
            } catch (Exception e) {
                System.out.print("你输入的不是整数！");
            }
        }
    }
}
