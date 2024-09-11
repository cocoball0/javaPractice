package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
//        사용자로부터 두 개의 정수를 입력받고 , 이 두 정수 사이의 모든 정수르 출력하는 프로그램을 작성
        int temp;

        Scanner input = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력하세요:");
        int num1 = input.nextInt();  //20
        System.out.print("두 번째 정수를 입력하세요:");
        int num2 = input.nextInt();  //10

        if (num1 > num2) {
            temp = num1;  //temp에 20
            num1 = num2;  //num1 에 10
            num2 = temp;
        }
        //이제 그냥 num1이랑 num2사이의 값들을 출력하기만 하면 끝.
        for (int i = num1+1; i  < num2; i++) {
            System.out.println("두 정수 사이 값은:"+ i );
        }
      }
    }

