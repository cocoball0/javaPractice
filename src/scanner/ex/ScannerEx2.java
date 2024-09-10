package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
//        사용자로부터 정수를 입력받고 홀수인지 짝수인지 입력
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 입력:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수입니다,");
        }else {
            System.out.println("홀수입니다.");
        }
    }
}
