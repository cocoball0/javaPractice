package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m =10;
        int temp = 0;
        if (m > 0) {
        temp = m * 2;
            System.out.println("temp =" + temp );

        }
        System.out.println("a = "+m);
//이 코드는  temp를 굳이 밖에서 선언해서 불필요한 메모리를
//        낭비하게 되고 코드의 복잡성 또한 생긴다
//        3-2는 이것을 보완한 코드
    }
}
