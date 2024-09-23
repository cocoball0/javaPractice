package school.miniProject.com.market.bookitem;

public abstract class Item {
    String bookId;
    String name;
    int unitPrice;

    public Item(String bookId, String name, int unitPrice) {
        this.bookId = bookId;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    // 추상 메서드는 코드 블락을 가질 수 없다. 상속받는 자식 클래스에서 오버라이딩 해야한다.
    abstract String getBookId();

    abstract void setBookId(String bookId);

    abstract String getName();

    abstract void setName(String name);

    abstract int getUnitPrice();

    abstract void setUnitPrice(int unitPrice);

}