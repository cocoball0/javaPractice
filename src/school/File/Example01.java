package school.File;
import java.io.File;
import java.io.IOException;

public class Example01 {
    public static void main(String[] args) {
        File fileObj = new File("example01.txt");
        try {
            boolean success = fileObj.createNewFile();
            if (success) {
                System.out.println("파일 생성 성공");
            } else {
                System.out.println("파일 생성 실패");
            }
        } catch (IOException e) {
            System.out.println("오류 발생 : "+ e.getMessage());
        }
    }
}
