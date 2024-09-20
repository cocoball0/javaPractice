package school.interface_.interface02;

public class Chicken implements Fly,Walk{
    @Override
    public void fly() {
        System.out.println("닭은 날 수 있다");
    }

    @Override
    public void walk() {
        System.out.println("닭은 걸을 수 있다");
    }
}
