package school.made_class;

public class Object01 {
    public static void main(String[] args) {
        System.out.println("****학생 주소록****");

        Student stObj1 = new Student();
        stObj1.insertRecord(20221004,"길순홍");
        stObj1.printInfo();

//        System.out.println(stObj1.id + " " + stObj1.name);
        Student stObj2 = new Student();
        stObj2.insertRecord(20021005, "홍길동");
        stObj2.printInfo();
    }
}
