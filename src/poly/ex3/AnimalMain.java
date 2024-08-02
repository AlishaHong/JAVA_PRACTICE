package poly.ex3;

public class AnimalMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        //추상클래스 인스턴스 생성 불가
//      AbstractAnimal animal = new AbstractAnimal();



        AbstractAnimal[] animal = {new Dog(),new Cat(),new Cow()};
        for (AbstractAnimal abstractAnimal : animal) {
            soundAnimal(abstractAnimal);
        }

        cat.move();
        dog.move();
        soundAnimal(cat);
    }

    private static void soundAnimal(AbstractAnimal animal){
        animal.sound();
    }
}
