package school.made_class;

public class Construction02 {
    public static void main(String[] args) {
        System.out.println("****학생 주소록****");
        Student stObj1 = new Student();

        stObj1.insertRecord(20221004, "길순홍");
        stObj1.printInfo();

        Student stObj2 = new Student();
        stObj2.insertRecord(20021005, "길동홍");
        stObj2.printInfo();
    }
}
