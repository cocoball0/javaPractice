package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
//        사용자로부터 n개의 정수를 입력받아 저장한 후, 배열 내에서 가장 작은 수를 찾아 출력하는 프로그램을 작성
        int minNumber ,maxNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요.");
        int num = input.nextInt();
        int []numbers = new int[num];
        System.out.println(num + "개의 정수를 입력하세요");
        for (int i = 0; i < num; i++) {
           numbers[i] = input.nextInt();
        }
        minNumber =numbers[0];
        maxNumber = numbers[0];
        for (int i = 0; i < num; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[0];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }


        }
        System.out.println("가장 작은 값:" + minNumber);
        System.out.println("가장 큰 값:" + maxNumber);
    }
}
