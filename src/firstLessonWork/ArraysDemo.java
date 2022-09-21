package firstLessonWork;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "zehra";
        students[1] = "aycan";
        students[2] = "şeyma";
        for(int i = 0; i< students.length;i++) {
            System.out.println(students[i]);
        }
        for(String student : students) {
           System.out.println(student);
        }
    }
}
