package extends1.super2;

public class ClassB extends ClassA{

    public ClassB(){
        super();
        System.out.println("classB 생성자");
    }
    public ClassB(int a) {
        super();//생략가능
        System.out.println("classb 생성자 a= " + a);
    }

    public ClassB(int a, int b){
        super();
        System.out.println("classb 생성자 a= " + a + " b=" + b);
    }
}
