package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
//        사용자로부터 상품의 가격 수량 입력받고 총비용 출력 -1 입력시 종료
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("상품의 가격을 입력하시오 (-1을 입력시 종료)");
            int price = scanner.nextInt();
            if (price == -1) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.print("상품의 수량을 입력하시오");
            int num = scanner.nextInt();
            int sum = price * num;
            System.out.println("상품의 총 가격은 " + sum + "입니다.");
        }
    }
}
