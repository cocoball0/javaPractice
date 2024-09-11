package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCost = 0;
        while (true) {
            System.out.print("1: 상품 입력 2: 결제 3:프로그램 종료");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("상품명을 입력하세요");
                String name = scanner.nextLine();
                scanner.nextLine();
                System.out.println("상품의 가격을 입력하세요");
                int price = scanner.nextInt();
                System.out.println("구매 수량을 입력하세요");
                int num = scanner.nextInt();
                totalCost = price * num;
                System.out.println("상품명:" + name + "가격:"+price+ "수량:" + num + "합계:" + totalCost);


            } else if (choice == 2) {
                System.out.println("총 비용 "+totalCost);
                totalCost = 0;

            } else if (choice == 3) {
                System.out.println("프로그램 종료");
                break;
            }else{
                System.out.println("잘못 입력하셨습니다.");
            }


        }
    }
}
