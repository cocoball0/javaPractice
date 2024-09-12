package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int sum = 0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("다섯 개의 정수를 입력하세요:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            //합과 평균 쓰는거 아니가
            sum += numbers[i];
            average = (double) sum / numbers.length;
        }

        System.out.println("출력");

        System.out.println("5개 정수의 합:" + sum);
        System.out.println("5개 정수의 평균:" + average);

    }
}
