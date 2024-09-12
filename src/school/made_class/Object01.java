package school.made_class;

public class Object01 {
    public static void main(String[] args) {
        Student stObj1 = new Student();

        stObj1.id = 20221004;
        stObj1.name = "홍길순";

        stObj1.printInfo();

//        System.out.println(stObj1.id + " " + stObj1.name);
        Student stObj2 = new Student();

        stObj2.insertRecode(20021005, "홍길동");

        stObj2.printInfo();
    }
}
