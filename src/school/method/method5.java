package school.method;

public class method5 {
        public static void calculate(int x, double y) {
        System.out.println(2 * x * y);
    }
    public static void main(String[] args) {
        int a= 4;
        double pi =3.14;
        System.out.println("원의 둘레 구하는 공식: 2 X 반지름 X 원주율");

        System.out.print("2 X" + a +"X"+ pi +" =");
        calculate(a,pi);

    }
}
