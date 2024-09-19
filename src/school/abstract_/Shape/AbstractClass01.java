package school.abstract_.Shape;

public class AbstractClass01 {
    public static void main(String[] args) {
        Circle s1 = new Circle("빨간색",2.2);
        Rectangle s2  = new Rectangle("갈색",2,3);


        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}
