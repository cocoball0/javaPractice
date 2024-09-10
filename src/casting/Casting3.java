package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;//int 최고값
        long maxIntOver = 2147483648L;//int 최고값 +1(초과)
        int intValue = 0;

        intValue = (int)maxIntValue; //형변환
        System.out.println("maxIntValue casting"+intValue);

        intValue = (int)maxIntOver; //형변환
        System.out.println("maxIntOver casting ="+ intValue);// 값이 오버플로우 된다 오버플로우가 되면 시계 한 바퀴 돈거처럼 int의 가장 작은 값부터 시작한다(음수부터)
//        그러나 long maxInvalue = 2147483647를 대입하면 int로 표현할 수 있는 범위이기 때문에
//                long -> int로 형변환을 해도 아무런 문제가 없다
    }
}
