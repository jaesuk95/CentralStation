package ex_this_getter_setter;

public class MainClass {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("어린왕장");
        book.setAuthor("Namia");
        book.setPrice(10000);

        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
        System.out.println(book.getTitle());
    }
}
