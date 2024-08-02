package construct.ex;

public class BookMain {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("자바의정석", "남궁성");
        book2.displayInfo();

        Book book3 = new Book("씨언어의 정석", "남궁성", 950);
        book3.displayInfo();
    }


}
