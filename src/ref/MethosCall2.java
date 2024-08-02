package ref;

public class MethosCall2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println(dataA.value);
        changeReference(dataA);
        System.out.println(dataA.value);
        System.out.println(dataA);

    }
    static void changeReference(Data datax){
        datax.value = 20;
        System.out.println(datax);
    }
}
