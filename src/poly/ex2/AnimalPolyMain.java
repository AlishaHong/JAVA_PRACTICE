package poly.ex2;

public class AnimalPolyMain {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        cow.sound();

    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
