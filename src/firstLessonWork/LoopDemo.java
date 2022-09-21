package firstLessonWork;

public class LoopDemo {

    public static void main(String[] args) {
        //For
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Ended for loop");
        int i = 0;
        //While
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Ended while loop");

        //Do While
        int j=1;
        do {
            System.out.println(j);
            j+=2;
        } while (j<10);
        System.out.println("Ended do-while loop");
    }
}
