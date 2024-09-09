package cond.ex;

public class condQuestion7 {
    //    정수 x가 주어지면 x가 짝수이면 "짝수"를 x가 홀수이면 "홀수"를 출력하는 프로그램을 작성
    public static void main(String[] args) {
        int x = 3;
        String result = (x % 2 == 1) ? " 홀수 " : " 짝수 ";
        System.out.println("x는"+result+"입니다.");
    }
}
