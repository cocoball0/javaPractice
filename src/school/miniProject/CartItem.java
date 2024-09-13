package school.miniProject;

public class CartItem {
    private String[] itemBook = new String[7];
    private String bookID;
    private int quantity;
    private int totalPrice;

    public CartItem() {
    }

    public CartItem(String[] book) {
        this.itemBook = book;
        this.bookID = book[0];
        this.quantity = 1;
        updateTotalPrice();
    }

    public String[] getItemBook() {
        return itemBook;
    }

    public void setItemBook(String[] itemBook) {
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
    }

    public  int getTotalPrice() {
        return totalPrice;
    }

    public void updateTotalPrice() {
        totalPrice = Integer.parseInt(this.itemBook[2])* this.quantity;  //Integer.parseInt: 문자열을 숫자로 변경하는 메서드
    }
}
