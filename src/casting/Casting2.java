package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.4;
        int intValue = 0;

//        intValue = doubleValue;//컴파일 오류 발생
        intValue = (int) doubleValue;//형변환
        System.out.println(intValue);
//        참고로 형변환을 한다고 해서 값이 변하거나 사리지지는 않는다.
    }
}
