package com.section03;
import java.util.Date;
public class Example09 {
    public static void main(String[] args) {
        Date date1 = new Date();
        //hew Date를 사용하면 현재 시간이 출력된다는게 중요
        System.out.println(date1);

        long millis = System.currentTimeMillis();
        Date date2 =new Date(0);
        System.out.println(date2);
    }
}
