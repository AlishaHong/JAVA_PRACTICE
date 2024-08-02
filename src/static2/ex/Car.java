package static2.ex;

public class Car {
    private String name;
    private static int count;

    public Car(String name) {
        this.name = name;
        System.out.println("구매차량 : " + name);
        count++;
    }

    public static void showTotalCars(){
        System.out.println("차 구매수 : " + count);
    }
}
