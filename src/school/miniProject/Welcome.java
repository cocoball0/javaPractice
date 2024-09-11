package school.miniProject;

import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println("Welcome to Shopping Mall");
        //System.out.println("Welcome to Book Market");
        Scanner input = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요:");
        String userName = input.next();

        System.out.print("연락처를 입력하세요:");
        int userMobile = input.nextInt();

        String greeting = "\t welcome to Shopping Mall";
        String togline = "\t Welcome to Book Market";

        boolean quit = false;
        while (!quit) {
            System.out.println("******************************************************************");
            System.out.println("\t" + greeting);
            System.out.println("\t" + togline);
//		System.out.println("******************************************************************");
//		System.out.println("1.고객 정보 확인하기 \t4.바구니에 항목 추가하기");
//		System.out.println("2.장바구니 상품 목록 추가하기 \t5.장바구니의 항목 수량 줄이기");
//		System.out.println("3.장바구니 비우기 \t\t6.장바구니의 항목 삭제");
//		System.out.println("7.영수증 표시하기 \t\t8.종료");
//		System.out.println("******************************************************************");

            manuIntroduction();

            System.out.println("메뉴 번호를 선택해주세요");
            int n = input.nextInt();
//		System.out.println(n +"번을 선택했습니다.");
            if (n < 1 || n > 8) {
                System.out.println("1부터 8까지의 숫자를 입력하세요.");
            } else {
                switch (n) {
                    case 1:
//                        System.out.println("1.현재 고객 정보:");
//                        System.out.println("이름:"+userName + "연락처"+userMobile);
                        menuGuestInfo(userName, userMobile);
                        break;
                    case 2:
//                        System.out.println("2.장바구니 상품 목록 보기:");
                        menuCartList();
                        break;
                    case 3:
//                        System.out.println("3.장바구니에 항목 추가하기:");
                        menuCartClear();
                        break;
                    case 4:
//                        System.out.println("4.장바구니 비우기");
                        menuCartAddItem();
                        break;
                    case 5:
//                        System.out.println("5.장바구니의 항목 수량 줄이기:");
                        menuCartRemoveItemCount();
                        break;
                    case 6:
//                        System.out.println("6.장바구니의 할목 삭제하기");
                        menuCartRemoveItem();
                        break;
                    case 7:
//                        System.out.println("7.영수증 표시하기");
                        manuCartBill();
                        break;
                    case 8:
//                        System.out.println("8.종료");
                        menuExit();
                       quit = true;

                }
            }
        }
    }

    public static void manuIntroduction() {
        System.out.println("******************************************************************");
        System.out.println("1.고객 정보 확인하기 \t 4.바구니에 항목 추가하기");
        System.out.println("2.장바구니 상품 목록 추가하기 \t5.장바구니의 항목 수량 줄이기");
        System.out.println("3.장바구니 비우기 \t\t 6.장바구니의 항목 삭제");
        System.out.println("7.영수증 표시하기 \t\t8.종료");
        System.out.println("******************************************************************");
    }

    public static void menuGuestInfo(String name, int mobile) {
        System.out.println("1.현재 고객 정보:");
        System.out.println("이름:" + name + "연락처" + mobile);
    }
    public static void menuCartList() {
        System.out.println("2.장바구니 상품 목록 보기:");
    }
    public static void menuCartClear() {
        System.out.println("3.장바구니 비우기:");
    }
    public static void menuCartAddItem() {
        System.out.println("4.장바구니에 항목 추가하기:");
    }
    public static void menuCartRemoveItemCount() {
        System.out.println("5.장바구니의 항목 수량 줄이기:");
    }
    public static void menuCartRemoveItem() {
        System.out.println("6.장바구니의 항목 삭제하기:");
    }
    public static void manuCartBill() {
        System.out.println("7.영수증 표시하기:");
    }
    public static void menuExit() {
        System.out.println("8.종료");
    }



}
