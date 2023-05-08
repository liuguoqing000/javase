package com.demo;

import java.util.Objects;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int b = 0;
        int a = 10;
        int c = 10;
        int d = 0;
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            b = c;
            System.out.println(a/b);
        }
    }
}

class Cat {

}
