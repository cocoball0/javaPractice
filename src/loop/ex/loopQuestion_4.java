package loop.ex;

public class loopQuestion_4 {
    public static void main(String[] args) {
        //for문을 이용해서 구구단을 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println("구구단:" + i +"x"+ j+ "=" + i * j);
            }
        }
    }
}
