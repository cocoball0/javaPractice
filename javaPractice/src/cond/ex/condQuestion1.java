package cond.ex;

public class condQuestion1 {
    public static void main(String[] args) {
        int score = 35;
        if(score >= 90){
            System.out.println("학점 A 입니다");
        }else if(score >= 80 && score <90){
            System.out.println("학점 B 입니다");
        }else if(score >= 70 && score <80){
            System.out.println("학점 C 입니다");
        }else if(score >= 60 && score <70){
            System.out.println("학점 D 입니다");
        }
        else{
            System.out.println("학점 F 입니다.");
        }

        };
    }
