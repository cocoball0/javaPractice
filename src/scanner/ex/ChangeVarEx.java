package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
//        a와 b의 값을 서로 변경하기
        int a = 10;
        int b= 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
