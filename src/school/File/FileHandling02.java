package school.File;

import java.io.File;
import java.io.FileOutputStream;

public class FileHandling02 {
    public static void main(String[] args) {
        File file = new File("gugudan.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            //파일에 데이터를 쓰기 위해 FileOutputStream 객체를 생성
            for (int x = 2; x <= 9; x++) {
                for (int y = 1; y <= 9; y++) {
                    String str = x + "X" + y + " =" + (x * y) + "\n";
                    byte[] b = str.getBytes();
                    //생성된 문자열을 바이트 배열로 변환하여 파일에 쓴다.
                    fos.write(b);
                }
                fos.write("\n".getBytes());
            }
            fos.close();
            System.out.println("파일쓰기성공");
        } catch (Exception e) {
            e.getMessage();
        }
    }

}
