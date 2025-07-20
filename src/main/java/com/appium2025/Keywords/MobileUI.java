package com.appium2025.Keywords;

public class MobileUI {
    public static void sleep(double second){
        try{
            Thread.sleep((long) (1000*second));
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
