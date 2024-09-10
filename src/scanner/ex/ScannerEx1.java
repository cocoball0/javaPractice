package scanner.ex;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("이름을 입력:");
        String name = scanner.nextLine();

        System.out.println("나이 입력:");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 "+ name +"나이는"+age+"입니다.");
    }
}
