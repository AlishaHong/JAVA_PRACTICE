package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
//        Animal dog = new Dog();
//        Duck duck = new Duck();
        Animal a = new Animal();
        a.sound();
        Animal[] animalArr = {new Dog(),new Cat(),new Cow(),new Duck(),new Pig()};

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //ctrl + alt + m 메서드 추출
    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}
