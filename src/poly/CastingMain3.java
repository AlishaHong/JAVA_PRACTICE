package poly;

public class CastingMain3 {
    public static void main(String[] args) {

        Child child = new Child();
        Parent parent1 = child; //업캐스팅은 생략가능
        Parent parent2 = (Parent)child;

        parent1.parentMethod();
        parent2.parentMethod();


    }

}
