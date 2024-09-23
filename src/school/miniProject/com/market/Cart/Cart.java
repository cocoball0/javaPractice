package school.miniProject.com.market.Cart;

import school.miniProject.com.market.bookitem.Book;

public class Cart implements CartInterface {

    static final int NUM_BOOK = 3;
    // CartItem 자료형 선언 = 객체 생성
    // itemBook(전체 책 정보), bookId(책id), quantity(책 수량), totalPrice(장바구니 총 가격)
    public CartItem[] mCartItem = new CartItem[NUM_BOOK];
    // 클래스 내부에서 여러번 사용해야하므로 객체없이 값을 가져올 수 있는 static 변수 선언
    public static int mCartCount = 0;
    //book 패키지에서도 사용하기 위해서는 public을 붙혀줘야한다

    // 기본 생성자
    public Cart() {}

    // 전체 도서 목록의 정보를 가져오는 메서드
    public void printBookList(Book[] booklist) {
        for (int i = 0; i < booklist.length; i++) {
            System.out.print(booklist[i].getBookId() + "|");
            System.out.print(booklist[i].getName() + "|");
            System.out.print(booklist[i].getUnitPrice() + "|");
            System.out.print(booklist[i].getAuthor() + "|");
            System.out.print(booklist[i].getDescription() + "|");
            System.out.print(booklist[i].getCategory() + "|");
            System.out.print(booklist[i].getReleaseDate());
            System.out.print("\n");
        }
    }

    // 장바구니에 같은 책 id가 있는지 확인 (있으면 수량 추가, 없으면 장바구니에 추가)
    public boolean isCartInBook(String bookId) {
        boolean flag = false;
        for (int i = 0; i < mCartCount; i++) {
            if (bookId == mCartItem[i].getBookID()) {
                // quantity 수량 1 증가
                mCartItem[i].setQuantity(mCartItem[i].getQuantity()+1);
                // true 반환
                flag = true;
            }
        }
        return flag;
    }

    // 책을 수량만큼 추가하는 메서드
    public void insertBook(Book book) {
        mCartItem[mCartCount++] = new CartItem(book);
    }

    // 장바구니에서 numId의 항목을 삭제하는 메서드
    public void removeCart(int numId) {
        CartItem[] cartItem = new CartItem[NUM_BOOK];
        int num = 0;

        for (int i = 0; i < mCartCount; i++)
            if (numId != i)
                cartItem[num++] = mCartItem[i];

        mCartCount = num;
        mCartItem = cartItem;
    }

//	public void removeCart(int numId) {
//		String bookId = mCartItem[numId].getBookID();
//
//	    for (int i = 0; i < mCartCount; i++) {
//	        if (mCartItem[i].getBookID().equals(bookId)) {
//	            int currentQuantity = mCartItem[i].getQuantity();
//	            if (currentQuantity > 1) {
//	                mCartItem[i].setQuantity(currentQuantity - 1);
//	                break;
//	            }
//	            else {
//	            	mCartCount--;
//	            	break;
//	            }
//	        }
//	    }
//	}

    // 장바구니 속 전체 수량 제거
    public void deleteBook() {
        // 전체 초기화
        mCartItem = new CartItem[NUM_BOOK];
        mCartCount = 0;
    }

    // 장바구니에 있는 상품 목록을 보여줌
    public void printCart() {
        System.out.println("장바구니 상품 목록 : ");
        System.out.println("------------------------------------------------");
        System.out.println("    도서ID\t|    수량\t|    합계");

        for (int i = 0; i < mCartCount; i++) {
            System.out.print("    "+mCartItem[i].getBookID()+"\t|");
            System.out.print("    "+mCartItem[i].getQuantity()+"    \t|");
            System.out.print("    "+mCartItem[i].getTotalPrice());
            System.out.println(" ");
        }
        System.out.println("-----------------------------------------------");
    }


}
