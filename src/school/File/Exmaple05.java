package school.File;
import java.io.FileReader;
import java.io.File;
public class Exmaple05 {
    public static void main(String[] args) {
        try {
            File file = new File("example03.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileReader fis = new FileReader(file);  //FileReader 객체 생성, 파일 열기
            int i = 0;   //문자 하나를 저장할변수 초기화
            while ((i = fis.read()) != -1) { //파일에서 한 문자를 읽음
                System.out.print((char) i); //출력
            }
            fis.close();
            System.out.println("\n파일읽기성공");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
