package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
//        사용자로부터 숫자를 입력받고 입력받은 정수 n의 구구단 출ㄹ력
        Scanner scanner = new Scanner(System.in);
        int answer = 0;


        System.out.print("구구단의 정수를 입력하세요");
        int num = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            answer = num * i ;
            System.out.println("입력받은 정수 "+num+"의 구구단은"+  num +"x"+ i + "="+answer +"입니다.");

        }
    }

}
