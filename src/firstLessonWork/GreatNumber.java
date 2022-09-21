package firstLessonWork;

public class GreatNumber {

    public static void main(String[] args) {
        int number = 28;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " is a greate number");
        } else {
            System.out.println(number + " is not a greate number");
        }
    }
}
