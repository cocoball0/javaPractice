package com.section03;

public class Package04 {
    public static void main(String[] args) {
        String str1 = "www.google.com";

        String[]arrStr1;

        arrStr1 = str1.split("\\."); //,을 찍으면 안됌
        //원하는 문자열로 쪼개는 방법
        for (int i = 0; i < arrStr1.length; i++) {
            System.out.println(arrStr1[i]);
        }
    }
}
