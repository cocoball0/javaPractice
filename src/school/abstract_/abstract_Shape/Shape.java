package school.abstract_.abstract_Shape;

public  abstract class Shape {
    String Color;

    abstract double area();
    public abstract String toString();

    public Shape(String Color) {
        System.out.println("Shape 클래스 생성자 호출");

        this.Color = Color;
    }
    public String getColor(){return Color;}


}
