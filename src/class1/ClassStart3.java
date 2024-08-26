package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();
        // 학생을 실제 메모리에 만든다. 학생이라는 정보를 Student 변수에 담아둔다.
        // 해당 변수를 통해서 이 학생을 사용할 수 있다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + "나이: " + student1.age + "점수: " + student1.grade);
    }
}
