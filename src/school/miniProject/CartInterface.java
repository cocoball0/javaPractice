package school.miniProject;

public interface CartInterface {
    void printBookList(Book[] p);
//    전체 도서 정보 목록을 출력합니다

    boolean isCartInBook(String id);
//    장바구니에 담긴 도서의 ID와 장바구니에 담을 도서의 ID를 비교하는 메서드
//    ID가 일치하면 장바구니에 담긴 도서의 개수를 1만큼 증가시키고 true를 반환하며, 그렇지 않으면 false를 반환
    void insertBook(Book p);
//    장바구니 항목 관리 클래스 CartItem에 도서정보를 등록하느 메서드
    void removeCart(int numId);

    void deleteBook();

}
