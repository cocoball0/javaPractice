package cond.ex;

public class condQuestion6 {
    public static void main(String[] args) {
//        두개의 정수 변수  a와 b를 가지고 있다. a의 값은 10이고 , b의 값은 20이다 삼항연산자를 사용하여 두 숫자 중 더 큰숫자를 출력하는
        int a = 30;
        int b = 20;
        String max = (a > b) ? "a" : " b";
        System.out.println("둘 중 값이 더 큰 값은" + max + "입니다.");
    }
}
