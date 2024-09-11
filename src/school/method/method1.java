package school.method;

import java.sql.SQLOutput;

public class method1 {
    public static void method(){
        System.out.println("static메서드입니다.");
        System.out.println(5+6);
    }

    public static void main(String[] args) {
        System.out.println("첫번째 호출 메서드입니다.");

        method();

        System.out.println("두 번째 호출 메서드입니다.");

        method();

    }
}
