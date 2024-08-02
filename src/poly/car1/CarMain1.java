package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {


        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        Model3Car model3Car = new Model3Car();

        driver.drive(k3Car);
        driver.drive(model3Car);

    }
}
