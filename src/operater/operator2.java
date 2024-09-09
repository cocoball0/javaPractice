package operater;

public class operator2 {
    public static void main(String[] args) {
        String result1 = "hello" + " world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        String result3 = "a + b= " + 10;
        System.out.println(result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
        //자바에서 숫자와 문자를 더하면 숫자를 문자열로 변경한 다음에 서로 더한다.
    }
}
