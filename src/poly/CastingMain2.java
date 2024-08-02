package poly;

public class CastingMain2 {
    public static void main(String[] args) {

        //부모 인스턴스가 자식 인스턴스 참조(다형적참조)
        Parent parent = new Parent();
        Parent poly = new Child();
        //단 자식의 기느은 호출할 수 없다.
        //poly.childMethod();

        //다운캐스팅(부모타입 -> 자식타입)
//        Child child = new Child();
        Child child = (Child) poly;
//        child.childMethod();

        //일시적 다운캐스팅
        ((Child)poly).childMethod();

        System.out.println(poly);
        System.out.println(child);
        System.out.println(parent);
    }
}