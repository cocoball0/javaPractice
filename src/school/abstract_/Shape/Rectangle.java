package school.abstract_.Shape;

public class Rectangle extends Shape {
    double length;
    double width;


    public Rectangle(String color, double length, double width) {
        super(color);  //부모 클래스(Shape)의 생성자를 호출하여 색상을 초기화
        System.out.println("Rectangle 클래스 생성자 호출"); // 생성자가 호출 될 떄 출력
        this.length = length;
        this.width = width;
    }


    double area() {
        return length * width;
    }
    public  String toString() {
        return "사각형 색상은"+super.getColor()+"그리고 면적은 :"+area();
    }
}
