package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {

        Child child = new Child();
        System.out.println("Child -> child");
        System.out.println("Value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스를 참조

        Parent parent = new Parent();
        System.out.println("parent -> parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조(다형적 참조)

        Parent poly = new Child();
        System.out.println("parent -> child");
        System.out.println("value ="+ poly.value);
        poly.method();

    }
}
