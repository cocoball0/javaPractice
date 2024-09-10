package loop.ex;

public class loopQuestion_3 {
    public static void main(String[] args) {
        //누적합게산  반복문을 사용하여 1부터 max까지의 합을 계산하고 출력하는 프로그램
        //sum이라느 변수를 사용하여 누적 합 i라는 변수  while + for 문 둘 다
        //for문
        int sum = 0;
        int max = 1000;

        for (int i = 0; i <= max; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
//         int i =0;
//         int sum = 0;
//         int max = 1000;
//
//        while (i <= max) {
//            sum += i;
//            i++;
//        }
//        System.out.println("sum = " +sum);
    }
}
