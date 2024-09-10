package cond;

public class Switch1 {
    public static void main(String[] args) {
        //switch문은 단순히 값이 같은지만 비교ㅕ할 수 있다.
        int grade = 2;
        int coupon;

        switch(grade){
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;

            case 3:
                coupon = 3000;
                break;

            default:
                coupon = 500;

        }
        System.out.println("발급받은쿠폰 " + coupon);
         }
}
