package arrayPractice;

import java.util.Arrays;

//1. 길이가 10인 배열만들기
//2. 배열 초기화 0~9까지로
//3. 섞기 100번


public class ArrayPractice {
    public static void main(String[] args) {

        System.out.println(args[1]);

        //섞기
        //배열생성

        int[] numArr = new int[10];

        //0-9로 초기화
        for(int i = 0; i < numArr.length ; i++){
            numArr[i] = i;
        }

        System.out.println(Arrays.toString(numArr));
        System.out.println();

        //100번 섞기
        for(int i = 0; i < 100 ; i++){
            int j = (int)(Math.random()*10);
            int tmp = numArr[0];
            numArr[0] = numArr[j];
            numArr[j] = tmp;
        }

        //프린트
        System.out.println(Arrays.toString(numArr));
        System.out.println();


        //숫자 세기
        //길이가 10인 배열생성

        int[] num = new int[10];
        int[] count = new int[10];

        //배열을 임의의 수로 초기화
        for(int i = 0 ; i < num.length; i++){
            num[i] = (int)(Math.random()*10);
        }

        //배열 print
        System.out.println(Arrays.toString(num));
        //띄어쓰기
        System.out.println();

        //카운팅
        for(int i = 0; i < num.length ; i++){
            count[num[i]]++;
        }

        //프린트
        for(int i = 0; i < num.length ; i++) {
            System.out.println(i + "의 개수 : " + count[i]);
        }

    }
}
