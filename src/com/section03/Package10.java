package com.section03;
import java.util.StringTokenizer;
public class Package10 {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("welcome to Java Programming","o",true);

        System.out.println("str.nextElement");
        while (str.hasMoreTokens()) {
            System.out.println(str.nextElement());
        }
    }
}
