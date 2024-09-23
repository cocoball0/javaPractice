package com.section03;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Package05 {
    public static void main(String[] args) {
        String str = "";
        Scanner in = new Scanner(System.in);
        System.out.println("입력 문자열:");
        str = in.nextLine();

        int len =str.length();

        String revStr1 = "";

        for (int i = len - 1; i >= 0; i--) {
            revStr1 = revStr1 + str.charAt(i);
        }
        System.out.println("String 클래스의 역순 문자열 : " +revStr1);

        StringBuffer revStr2 = new StringBuffer(str);
        revStr2.reverse();

        System.out.println("StringBuffer클래스의 역순 문자열:"+revStr2);
        //String은 불변 StringBuffer는 가변
        //String Buffer가 문자열을 수정할 때 더 효과적이다.
        //String은 짧고 변하지않는 문자열에 StringBuffer는 긴 문자열을 자주 변경해야 할 때 사용
    }
}
