package school.inheritance.parent;

public class inheritance03 {
    public static void main(String[] args) {
        SubSon objSon = new SubSon();
        objSon.printSon();
        objSon.printFather();
        objSon.printGrandFather();

        subDaughter objDaughter = new subDaughter();
        objDaughter.printDaughter();
        objDaughter.printFather();
    }
}
