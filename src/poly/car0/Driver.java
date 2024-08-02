package poly.car0;

public class Driver {

//    public K3car k3car = new K3car();
    private K3car k3car;  //현재는 null 셋터로 생성된 객체를 외부에서 넣어줌
    private Model3Car model3Car;

    //k3와 모델 3카를 알고있따 = 의존하고 있다
    //구체적인 자동차를 모르고 자동차 역할만 알수 있게 해보자

    public void setK3car(K3car k3car){
        this.k3car = k3car;
    }

    public void setModel3Car(Model3Car model3Car){
        this.model3Car = model3Car;
    }


    public void drive(){
        System.out.println("자동차를 운전합니다.");
        if(k3car != null){
            k3car.startEngine();
            k3car.pressAccelerator();
            k3car.offEngine();
        }else if(model3Car != null){
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }



}
