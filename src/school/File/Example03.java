package school.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileWriter;
public class Example03 {
    public static void main(String[] args) {

        try {
            File file = new File("example03.txt");
            if (!file.exists())
                file.createNewFile();
            FileWriter myWriter = new FileWriter(file);

            myWriter.write("Hello!!\n");
            myWriter.write("java Programming");
            myWriter.close();
            System.out.println("파일쓰기 성공");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
