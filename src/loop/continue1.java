package loop;

public class continue1 {
    public static void main(String[] args) {
        int i = 1;

        //3을 제외하고 나머지 출력하게 해야댄다.
      while(i <= 5){
          if(i == 3){
              i++;
              continue;
          }
          System.out.println(i);
          i++;
      }
    }
}
