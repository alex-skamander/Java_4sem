package com.company.pr5;

public class Main {
    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.getInstance();
        Singleton1 s1break = Singleton1.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        Singleton2 s2break = Singleton2.getInstance();
        Singleton3 s3 = Singleton3.getInstance();
        Singleton3 s3break = Singleton3.getInstance();
        System.out.println(s1);
        System.out.println(s1break);
        System.out.println(s2);
        System.out.println(s2break);
        System.out.println(s3);
        System.out.println(s3break);
    }

}
