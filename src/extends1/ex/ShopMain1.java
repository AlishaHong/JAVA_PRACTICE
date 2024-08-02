package extends1.ex;

public class ShopMain1 {
    public static void main(String[] args) {
        Book book = new Book("java", 10000, "han", "!2345");
        Album album = new Album("앨범", 13000,"seo");
        Movie movie = new Movie("영화", 10000, "감독", "배우");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품가격의 합 : " + sum);

    }
}
