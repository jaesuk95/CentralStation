package ex_this_getter_setter;

public class Book {

    private String title;
    private String author;
    private int price;

    //  일단 this 는 이것 이라는 뜻
    // this 는 클래스 내부안에서만 사용이 가능하며
    // 여기 안에서 class 를 사용하면, "Book" public class Book 을 뜻한다
    // title = title 를 사용하지 않는 이유는 private String title 과 public .. setTitle(String title) 이 겹치기 때문이다
    // title = title 은 같은 내용을 덮어 쓰는 것이다.
    // this.title 은 private field 에서 불러온다
    // this 는 현재 이 클래스를 의미한다.

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }



    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }



    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}

