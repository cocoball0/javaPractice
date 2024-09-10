package loop.ex;

public class loopQuestion_2 {
    public static void main(String[] args) {
        //반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램  이때 num이란  변수(for,while문 둘 다)
        //for묹
//        int num = 0;
//        for (num = 0; num <= 10; num++) {
//            if (num % 2 == 0) {
//                System.out.println("num = " +num);
//            }
//        }
        // while문
        int num = 0;

        while (num <= 10) {
            if (num % 2 == 0) {
                System.out.println("num = " +num);
            }num++;
        }
    }
}
