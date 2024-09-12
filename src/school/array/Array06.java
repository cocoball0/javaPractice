package school.array;

public class Array06 {
    public static void main(String[] args) {
        String s = "Java Programming ";
        String s1 = "Java";
        String s2 = " Programming";
        String s3 = s1.concat(s2);
        String s4 = s.trim(); //선행 및 후행 공백을 생략한다.

        System.out.println("s3 " + s3);
        System.out.println("s4 " + s4);
        System.out.println("s3.equals(s4) " + s3.equals(s4));
    }
}
