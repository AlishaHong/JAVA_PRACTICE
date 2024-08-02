package poly.diamond;

public class Child implements InterfaceA,InterfaceB {

    @Override
    public void methodA() {
        System.out.println("child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("child.methodb");
    }

    @Override
    public void methodCommon() {
        System.out.println("child.methodCommmon");
    }
}
