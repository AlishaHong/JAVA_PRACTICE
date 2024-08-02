package ref;

public class Method1 {
    public static void main(String[] args) {

        Student student1 = new Student();


        Student student2 = new Student();


        initStudent(student1,"유경",20);
        initStudent(student2,"맹석", 30);
        printStudent(student1);
        printStudent(student2);


    }

    static void printStudent(Student student) {
        System.out.println("이름:" + student.studentName + "나이:" + student.age);
    }
    static void initStudent(Student student, String studentName, int age){
        student.studentName = studentName;
        student.age = age;
    }

    }
