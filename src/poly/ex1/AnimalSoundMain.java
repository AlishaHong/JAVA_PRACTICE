package poly.ex1;

public class AnimalSoundMain {
    public static void main(String[] args) {


        Dog dog = new Dog();
        Cow cow = new Cow();
        Cat cat = new Cat();
        System.out.println("동물소리 테스트시작");
        dog.sound();
        System.out.println("동물소리 종료");

        soundCat(cat);

        soundCow(cow);

    }
    private static void soundCat(Cat cat){
        System.out.println("동물소리 테스트시작");
        cat.sound();
        System.out.println("동물소리 종료");
    }
    private static void soundCow(Cow cow){
        System.out.println("동물소리 테스트시작");
        cow.sound();
        System.out.println("동물소리 종료");
    }
}
