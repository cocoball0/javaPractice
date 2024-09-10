package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
//        사용자로부터 이름 가격 수량을 입력받아 주문한 음식의 총 가격을 계산하고 출력
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("음식의 이름 입력:");
        String name = input.nextLine();

        System.out.print("가격 입력:");
        int price = input.nextInt();

        System.out.print("수량 입력:");
        int num = input.nextInt();

        sum = price * num;
        System.out.println(name + "을(를)" + num + "개 주문 하셨습니다. 총 가격은 " + sum + "입니다.");






    }
}
