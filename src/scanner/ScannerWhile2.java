package scanner;
import java.util.Scanner;
public class ScannerWhile2 {
    public static void main(String[] args) {
//        첫 번 쨰 숫자와 두 번째 숫자를 더해서 출력하는 프로그램을 개발
//                첫 번째 숫자와 두번째 숫자를 모두 0으로 입력하면 프로그램을 종료
//                프로그램은 반복해서 실행한다.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하시오:");
            int num1 = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하시오");
            int num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            int sum = num1 + num2;
            System.out.println("두 수의 합은:" + sum);
        }
    }
}
