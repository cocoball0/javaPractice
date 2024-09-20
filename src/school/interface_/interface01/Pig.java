package school.interface_.interface01;

public class Pig implements Animal02 {

    @Override
    public void animalSound() {
        System.out.println("꿀꿀꿀");
    }

    @Override
    public void animalWalk() {
        System.out.println("네 발로 걷다.");
    }
}
