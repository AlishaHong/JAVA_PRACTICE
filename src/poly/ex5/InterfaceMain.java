package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
         //인터페이스 생성 불가
//        InterfaceAnimal animal = new InterfaceAnimal();


        InterfaceAnimal[] animal = {new Dog(), new Cat(), new Cow()};
        for (InterfaceAnimal interfaceAnimal : animal) {
            soundAnimal(interfaceAnimal);
            moveAnimal(interfaceAnimal);
        }
//
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Cow cow = new Cow();
//        soundAnimal(cat);
//        soundAnimal(dog);
//        soundAnimal(cow);
//
//        moveAnimal(cat);
//        moveAnimal(dog);
//        moveAnimal(cow);
    }

        private static void soundAnimal(InterfaceAnimal animal){
            animal.sound();
        }
        
        private static void moveAnimal(InterfaceAnimal animal) {
            animal.move();

        }
}
