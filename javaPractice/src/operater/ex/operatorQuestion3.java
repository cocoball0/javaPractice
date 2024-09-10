package operater.ex;

public class operatorQuestion3 {
    public static void main(String[] args) {
      int score = 89;
        //score가 80점 이상이고 ,100점 이하면 true 아니면 false

        boolean result = 80 <= score && score<= 100;
        System.out.println("result = " + result);
    }
}
