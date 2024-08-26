package ref;

import java.awt.event.HierarchyBoundsAdapter;

public class Method1 {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        Student student1 = new Student();
        initStudent(student1,"학생1",15,90);
        students[0] = student1;

        Student student2 = new Student();
        initStudent(student2,"학생2",16,88);
        students[1] = student2;

        for (Student s : students) {
            printStudent(s);
        }

    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
