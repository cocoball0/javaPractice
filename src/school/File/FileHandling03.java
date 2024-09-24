package school.File;
import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;

public class FileHandling03 {
    public static void main(String[] args) {
        File file = new File("member.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            Scanner input = new Scanner(System.in);

            boolean quit = false;
            while (!quit) {
                System.out.println("아이디:");
                String userID = input.next();
                fw.write("아이디: " + userID + " ");

                System.out.println("이름 : ");
                String userName = input.next();
                fw.write("이름: " + userName + "\n");

                System.out.println("계속 진행할래? Y | N");
                input = new Scanner(System.in);
                String str = input.nextLine();

                if (str.toUpperCase().equals("N")) {
                    quit = true;
                }
            }
            fw.close();
            System.out.println("파일쓰기 성공");

        } catch (Exception e) {
            System.out.println("오류 발생 "+e.getMessage());
        }
    }
}
