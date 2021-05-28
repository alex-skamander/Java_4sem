package com.company.pr5;

//Метод ленивой инициализации с двойной блокировкой
public class Singleton3 {
    private static Singleton3 SINGLE_INST;
    private Singleton3() {}
    public static Singleton3 getInstance() {
        if (SINGLE_INST == null) {
            synchronized (Singleton3.class) {
                if (SINGLE_INST == null) {
                    SINGLE_INST = new Singleton3();
                }
            }
        }
        return SINGLE_INST;
    }
}