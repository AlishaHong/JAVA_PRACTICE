package class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview mr1 = new MovieReview();
        mr1.title = "바람과함께사라지다";
        mr1.review = "굳";

        MovieReview mr2 = new MovieReview();
        mr2.title = "타이타닉";
        mr2.review = "인생역작";

        MovieReview[] movies = {mr1, mr2};
        for (MovieReview m : movies) {
            System.out.println("영화제목:" + m.title + " 리뷰:" + m.review);
        }
    }
}
