package school.exception;

import java.util.Scanner;

public class Exception02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int num = s.nextInt();

        int arr[] = new int[5];

        try {
            arr[num] = 10 / num;
            System.out.println(arr[num]);
        } catch (ArithmeticException e) {  // 수정된 부분
            System.out.println("0이 아닌 값을 입력하세요.");
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("올바른 인덱스 배열을 입력하세요.");
            System.out.println(e.getMessage());
        }
    }
}
