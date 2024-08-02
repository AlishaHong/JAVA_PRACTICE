package extends1.ex2;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.move();
        ec.charge();

        GasCar gc = new GasCar();
        gc.move();
        gc.fillUp();

    }
}
