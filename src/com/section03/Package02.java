package com.section03;

import com.javamaster.mypackage.Dog;
public class Package02 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1.equals(dog2)); //얘네는 주소값이 같은지 물어보는거라 false

        String str1 = dog1.bowwow();
        String str2 = dog2.bowwow();
        System.out.println(str1.equals(str2)); //얘네는 멍멍이 같냐는 뜻이라 true
    }
}
