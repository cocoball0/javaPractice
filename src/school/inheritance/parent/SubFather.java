package school.inheritance.parent;

public class SubFather extends GrandFather {
    String familyName = "프로게이머 ";
    String houseAddress = "인천";

    void printFather() {
        System.out.println("나는 아빠인데 할아버지한테 상속을 받습니다.");
    }
}
