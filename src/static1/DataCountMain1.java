package static1;

public class DataCountMain1 {
    public static void main(String[] args) {

        Data1 data1 = new Data1("a");
        System.out.println("a count : "+ Data1.count);

        Data1 data2 = new Data1("b");
        System.out.println("b count : " + Data1.count);

        Data1 data3 = new Data1("c");
        System.out.println("c count : " + Data1.count);
    }



}
