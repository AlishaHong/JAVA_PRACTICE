package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        Child child = new Child();
        child.methodA();
        child.methodB();
        child.methodCommon();
        boolean child1 = a instanceof Child;
        System.out.println(child1);
    }
}
