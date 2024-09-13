package school.made_class;

public class AccessModifier01 {
    public static void main(String[] args) {
        Dog dogObj = new Dog();
        Dog dogObj2 = new Dog();
        Dog dogObj3 = new Dog();

        dogObj.breed = "포메라니안";
        dogObj.color = "갈색";
        dogObj.size = "작음";

        dogObj2.breed = "웰시코기 꾸이";
        dogObj2.color = "돼지";
        dogObj2.size = "너무 큼ㅜ";

        dogObj3.breed = "잭 러셀테리어";
        dogObj3.color = "3색";
        dogObj3.size = "작지만 날쌤";

        System.out.println("강아지 품종:"+dogObj.breed);
        System.out.println("강아지 색깔:"+dogObj.color);
        System.out.println("강아지 사이즈:"+dogObj.size);
        dogObj.bowwow();
        System.out.println("강아지 품종:"+dogObj2.breed);
        System.out.println("강아지 색깔:"+dogObj2.color);
        System.out.println("강아지 사이즈:"+dogObj2.size);
        System.out.print("꾸이는 맨날 간식을 보면 ");
        dogObj.run();
        System.out.println("강아지 품종:"+dogObj3.breed);
        System.out.println("강아지 색깔:"+dogObj3.color);
        System.out.println("강아지 사이즈:"+dogObj3.size);
        System.out.print("잭은 늘 ");
        dogObj.run();
        dogObj.bowwow();
    }
}
