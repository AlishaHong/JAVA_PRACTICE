package extends1.ex3;


public class CarMain {
    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.move();
        ec.charge();
        ec.openDoor();

        GasCar gc = new GasCar();
        gc.move();
        gc.fillUp();
        gc.openDoor();

        HydrogenCar hc = new HydrogenCar();
        hc.move();
        hc.fillHydrogen();
        hc.openDoor();

    }
}
