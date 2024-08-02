package ref;

public class Method2 {
    public static void main(String[] args) {


        Student student1 = createStudent("학생1",20);
        Student student2 = createStudent("학생2", 20);



        printStudent(student1);
        printStudent(student2);


    }
    static Student createStudent(String studentName, int age){
        Student student = new Student();
        student.studentName = studentName;
        student.age = age;
        return student;

    }
    static void printStudent(Student student) {

        System.out.println("이름:" + student.studentName + "나이:" + student.age);
    }

    }
