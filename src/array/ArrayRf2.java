package array;

public class ArrayRf2 {
    public static void main(String[] args) {
       int [] students = {90,80,70,60,50,20,20,20,20}; //배열 생성과 초기화
        //배열부분 수정해도 문제없이 잘 돌아간다.
        //변수 값 사용
        for (int i =
         0; i < students.length; i++) {   //  ==for(int i = 0; i <students.Length;i++){
            System.out.println("학생"+(i + 1)+"점수:"+students[i]);}
    }
}
