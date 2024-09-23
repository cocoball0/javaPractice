package com.section03;

import java.util.Random;

public class Example12 {
    public static void main(String[] args) {
        Random random1 = new Random();
        System.out.println("난수 값 : " + random1.nextInt());

        Random random2 = new Random();
        System.out.println(random2.nextInt(100)+""); //100미만의 난수 발생
    }
}
