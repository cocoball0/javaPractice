package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
//        사용자로부터 이름과 나이를 반복해서 입력받고 ,입력받은 이름과 나이를 출력하는 프로그램이다. 사용자가 종료를 누르면 프로그램 종료
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요:");
            String name = scanner.nextLine();
            if (name.equals("END")) {
                break;

            }
            System.out.print("나이를 입력하세요:");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("이름은 " + name + "나이는" + age);

        }

    }
}
