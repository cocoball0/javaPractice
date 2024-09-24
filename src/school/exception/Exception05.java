package school.exception;

class InvalidException extends Exception {
    public InvalidException(String s) {
        super(s);
    }
}
public class Exception05 {
    void check(int weight)throws InvalidException {
        if (weight < 100) {
            throw new InvalidException("InvalidException클래스 호출");
        }else{
            System.out.println("웅장하다");
        }
    }

    public static void main(String[] args) {
        Exception05 obj = new Exception05();
        try {
            obj.check(400);
        } catch (InvalidException ex) {
            System.out.println("예외처리입니다");
            System.out.println(ex.getMessage());
        }
    }

}
