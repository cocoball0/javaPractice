package loop.ex;

public class loopQuestion_1 {
    public static void main(String[] args) {
        //처음 10개의 자연수를 출력하는 프로그램을 작성 count 라는 변수 사용 ,while문 for문 둘 다 작성
        //for문
//        for (int count = 1; count <= 10; count++) {
//            System.out.println("count = " + count);
//
//        }
        //while문
        int count = 1;
        int endNum = 10;

        while (count <= endNum) {
            System.out.println("count = " + count);
            count++;
        }

    }
}
