package com.section03;
import java.util.Date;
public class Package08 {
    public static void main(String[] args) {
        Date this_date = new Date(2024, 9, 23);
        Date given_date = new Date(2020, 9, 23);

        boolean status1 = this_date.after(given_date);
        boolean status2 = this_date.before(given_date);

        System.out.println("2024,09,23일은 2020 9,23일 이후 일이다.:" + status1);
        System.out.println("2024,09,23일은 2020 9,23일 이전 일이다.:" + status2);
    }
}
