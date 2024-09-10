package loop.ex;

public class loopQuestion_5 {
    public static void main(String[] args) {
        //수만큼 피라미드를 출력하라 (참고 : println은 출력 후 다음라인으로 넘어간다.출력만 할려면 print()
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
         }

    }
}
