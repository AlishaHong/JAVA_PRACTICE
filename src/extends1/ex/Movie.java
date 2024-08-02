package extends1.ex;

public class Movie extends Item {

   private String director;
   private String actor;

    public Movie(String title, int price,String director, String actor) {
        super(title,price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    void print(){
        super.print();
        System.out.println("-감독 : " + director + " 배우 : " + actor);
    }
}
