package school.interface_.interface02;

public interface Interface02 {
    public static void main(String[] args) {
        Chicken myChicken = new Chicken();
        Bird myBird = new Bird();

        myBird.fly();
        myChicken.fly();
        myChicken.walk();
    }
}
