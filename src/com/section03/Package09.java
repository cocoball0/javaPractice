package com.section03;
import java.util.Calendar;

public class Package09 {
    public static void main(String[] args) {
        Calendar obj1 = Calendar.getInstance();
        Calendar obj2 = Calendar.getInstance();
        obj2.add(Calendar.YEAR, 10);
        System.out.println("obj1:" + obj1.getTime());
        System.out.println("obj2:" + obj2.getTime());
        int comp = obj1.compareTo(obj2);
        System.out.println("obj1.compareTo(obj2):" +comp);
        //음수가 나오면 obj1이 obj2보다 이전 날짜임을 나타냄 같으면 0
    }
}
