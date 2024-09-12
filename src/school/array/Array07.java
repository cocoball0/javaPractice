package school.array;

import java.beans.JavaBean;

public class Array07 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = s1;  //옅은 복사(주소값을 복사)

        if(s1==s2) System.out.println("s1과 s2는 같아");
        else System.out.println("s1과 s2는 같지 않다");

        if(s1 == s3) System.out.println("s1과 s3은 같아");
        else System.out.println("s1과 s3은 같지 않다");

        if(s1.equals(s2)) System.out.println("s1과 s2의 값은 같아.");
        else System.out.println("s1과 s2의 값은 같지않다.");
    }

}
