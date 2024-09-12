package array;

public class EnhanceFor1 {
    public static void main(String[] args) {
        int[]numbers ={1,2,3,4,5};

        //일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println("number");
        }

        //향상된 for문 for-each문
        for (int number : numbers) {
            System.out.println(number);
            //실무에서 가장 많이 쓰는 for문 (iter:단축키 느낌)
        }
        //for-each문을 사용할 수 없는 경우, 증가하는 index 값 필요
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number " + i + "번의결과는:" + numbers[i]);  //이 예제에서는 증가하는 인덱스 값을 직접 사용하는 경우
        }
    }
}
