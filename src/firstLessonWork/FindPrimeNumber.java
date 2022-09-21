package firstLessonWork;

public class FindPrimeNumber {
    public static void main(String[] args) {
        int number = 28;
        int reminder;
        boolean isPrime = true;

        if (number < 2) {
            System.out.println(number + " is an invalid number");
            return;
        }

        for (int i = 2; i <= number; i++) {
            reminder = number % i;
            if (reminder == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime");
        }else {
            System.out.println(number + " is not prime");
        }
    }
}
