package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall(){
        staticValue++; //정적변수에 접근
//        instanceValue++;
        staticMethod();
//        instanceMethod();
    }
    public void instanceCall(){
        staticValue++;
        instanceValue++;
        staticMethod();
        instanceMethod();
    }

    private void instanceMethod(){
        System.out.println("instance : " + instanceValue);

    }
    private static void staticMethod(){
        System.out.println("static : "+ staticValue);
//        System.out.println(instanceValue);
    }
}
