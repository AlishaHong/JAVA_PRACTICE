package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentName = {"학생1","학생3","학생4"};
        int[] studentAges = {15,21,12};
        int[] studentGrades = {90,100,12};

        for(int i = 0; i < studentName.length; i++){
            System.out.println("이름 :" + studentName[i] + " 나이 : "  + studentAges[i] + " 성적 : "+ studentGrades[i]);
        }

    }
}
