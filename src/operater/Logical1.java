package operater;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활요");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);
        /*&&:두 연산자가 모두 참이어야 true를 반환한다. 둘 중 하나라도 거짓이면 false를 반환
        *||:두 연산자 중 하나라도 참이면 true를 반환한다 둘 다 거짓이면 false
        * !:피연산자의 논리적부정을 반환한다. 거짓이면 참을 반환*/
    }
}
