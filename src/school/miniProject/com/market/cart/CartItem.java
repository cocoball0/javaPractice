package school.miniProject.com.market.cart;

import school.miniProject.com.market.bookitem.Book;

public class CartItem {
    // 클래스로 자료형 선언
    private Book itemBook; // 기존에 배열로 관리하던 7개의 값을 Book이라는 클래스로 만듦
    private String bookID;
    private int quantity;
    private int totalPrice;

    // 기본 생성자
    public CartItem() {}

    // 객체 booklist를 받는 생성자
    public CartItem(Book booklist) {
        this.itemBook = booklist;
        this.bookID = booklist.getBookId();
        this.quantity = 1;
        updateTotalPrice();
    }

    public Book getItemBook() {
        return itemBook;
    }

    public void setItemBook(Book itemBook) {
        this.itemBook = itemBook;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.updateTotalPrice();
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void updateTotalPrice() {
        totalPrice = this.itemBook.getUnitPrice() * this.quantity;
    }
}