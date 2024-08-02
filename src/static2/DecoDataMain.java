package static2;

import static static2.DecoData.staticCall;
//이걸 사용하겠다고 선언해버리는것

public class DecoDataMain {
    public static void main(String[] args) {
        staticCall();
        staticCall();
//        DecoData.instanceCall();
        DecoData data1 = new DecoData();
        data1.instanceCall();
        data1.instanceCall();

        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();
        staticCall();





    }
}
