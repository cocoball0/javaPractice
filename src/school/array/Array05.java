    package school.array;

    public class Array05 {
        public static void main(String[] args) {
            String s1 = "Java Programming";
            String s2 = new String("Java Programming");

            System.out.println(s1);
            System.out.println(s2);
//            s2와 같은 방식을 쓰는이유 : 동일한 문자열이지만 반드시 서로 다른 객체로 처리되어야 하는 경우
        }
    }
