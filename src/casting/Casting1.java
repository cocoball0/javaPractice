package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long
        System.out.println("longValue = "+ longValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = "+ doubleValue);

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue2 = "+ doubleValue);

//    자바는 기본적으로 작은 곳에서 큰 범위 타입에 대입하는 건 문제가 되지 않는다.
        //자동 형변환 == 묵시적 형변환
    }
}
