package school.inheritance;

class CalculateSquare {
    public void square() {
        System.out.println("No parameter Method Called");
    }

    public int square(int width, int height) { // 메서드 이름 수정 (Square -> square)
        int area = width * height;
        return area;
    }

    public double square(double width, double height) {
        double area = width * height;
        return area;
    }

    public double square(int width, double height) {
        double area = width * height;
        return area;
    }
}

public class Polymorphism01 {
    public static void main(String[] args) {
        CalculateSquare myArea = new CalculateSquare();
        System.out.println("가로 10 , 세로 10.5 사각형의 넓이는 "+myArea.square(10,10.5));
        System.out.println("가로:10, 세로:5 사각형의 넓이는: " + myArea.square(10, 5));
        System.out.println("가로:2.5, 세로:4.5 사각형의 넓이는: " + myArea.square(2.5, 4.5));
    }
}
