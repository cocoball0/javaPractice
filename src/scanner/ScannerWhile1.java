package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
//        문자열을 받는 Scanner 그러나 exit를 입력하면 종료
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하시오(exit:종료)");
            String str = scanner.nextLine();
            if (str.equals("exit")) {//문자열에서는 == 대신에 .equals()를 사용한다.
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열:" + str);

        }
    }
}
