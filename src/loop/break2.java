package loop;

public class break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true){
            sum += i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료"+ sum +  " i의 값은 "+ i);
                break;
            }
            i++;
        }

    }
}
