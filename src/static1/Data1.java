package static1;

public class Data1 {
    public String name;
    public static int count;

    public Data1(String name) {
        this.name = name;
        count++;
        //객체가 생성될 때 마다 생성자를 통해 count 변수를 1씩 증가시킴
    }

}
