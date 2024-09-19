package school.inheritance.Animal;

public class Polymorphism02 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
//        Dog myDog = new Dog();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.eat();

    }
}
