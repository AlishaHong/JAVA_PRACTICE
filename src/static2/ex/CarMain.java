package static2.ex;

//import static static2.ex.Car.showTotalCars;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("g80");
        Car car3 = new Car("Model y");

        Car.showTotalCars();//구매한 차량 수를 출력하는 스테틱 메서드
    }
}
