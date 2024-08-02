package oop1.ex;

public class Rectangle {

    // 직사각형의 넒이, 둘레길이,정사각형 여부 구하기
    int width ;
    int height;

    //넓이를 구하는 메서드
    void area() {
        int area = width * height;
        System.out.println("넓이 : " + area);
    }

    //둘레길이 구하는 메서드
    void totalLength() {
        int totalLength = (width * 2) + (height * 2);
        System.out.println("둘레 : "+ totalLength);
    }

   //정사각형 여부 확인
    void isSquare() {
        if (width == height) {
            System.out.println("정사각형입니다.");
        } else {
            System.out.println("정사각형이 아닙니다.");
        }
    }
}