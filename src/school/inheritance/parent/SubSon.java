package school.inheritance.parent;

public class SubSon extends SubFather {
    void printSon() {
        System.out.println("나는 아들입니다.");
        System.out.println("나는 아버지로부터 상속을 받습니다.");
        System.out.println("나의 아버지는 :" + this.familyName);
        System.out.println("나의 집은 :" + this.houseAddress);
    }
}
