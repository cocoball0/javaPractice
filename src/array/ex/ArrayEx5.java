package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum= 0;
        double average = 0;
        System.out.println("입력받을 숫자의 개수를 입력하셈:");
        int count = scanner.nextInt();
        int []numbers = new int [count];
        System.out.println(count +"개의 정수를 입력하세요");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
            average = (double) sum / numbers.length;
        }
//
        System.out.println("입력한 숫자들의 합:" + sum);
        System.out.format("입력한 숫자들의 평균%.2f",average);
    }
}
