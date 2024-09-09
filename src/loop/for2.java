package loop;

public class for2 {
    //1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 ?
    public static void main(String[] args) {
        int sum = 0;

        for(int i =1; ;i++){
            sum += i;
            if(sum > 10){
                System.out.println("i =" + i +" sum =" + sum);
                break;
            }
            //for문없이 while문으로 모든 반복을 다룰 수 있다.하지만
            //카운터변수가 명확하거나, 반복 횟수가 정해진 경우에는 for문을 사용하는 것이 더 깔끔하고 유지보수하기 좋다.
        }
    }
}
