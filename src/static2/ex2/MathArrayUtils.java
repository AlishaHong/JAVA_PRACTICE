package static2.ex2;

import java.util.Arrays;

public class MathArrayUtils {

    private MathArrayUtils() {
    }
    //외부에서 객체생성 불가

    static int sum(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }return sum;
    }

    static double average(int[] array){
      return  (double)sum(array)/array.length;
    }


    static int min(int[] array){
        int min = array[0];
        for (int i : array) {
            if(i < min){
                min = array[i];
            }
        }return min;
    }

    static int max(int[] array){
        int max = array[0];
        for (int i : array) {
            if(i>max){
                max = array[i];
            }
        }return max;
    }
//    static int min(int[] array){
//        int min = 0;
//        for (int i : array) {
//            Arrays.sort(array);
//            min = array[0];
//        }return min;
//    }

//    static int max(int[] array){
//        int max = 0;
//        for (int i : array) {
//            Arrays.sort(array);
//            max = array[array.length-1];
//        }return max;
//    }
}
