package school.abstract_.Vehicle;

public class Example {
    public static void main(String[] args) {
        Bike myBike = new Bike();
        Car myCar = new Car();
        myBike.printType();
        myBike.printBrand();
        myBike.printPrice();
        myBike.printWish();

        System.out.println("-----------------------");
        myCar.printType();
        myCar.printBrand();
        myCar.printPrice();
        myCar.printSecond();
    }
}
