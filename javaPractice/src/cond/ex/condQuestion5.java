package cond.ex;

public class condQuestion5 {
    public static void main(String[] args) {
        String grade = "B";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성적입니다");
                break;
            case "B":
                System.out.println("좀 탁월한 성적입니다");
                break;
            case "C":
                System.out.println("덜 탁월한 성적입니다");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }
    }
}
