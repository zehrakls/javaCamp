package firstLessonWork;

public class FindNumber {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 8, 16, 21};

        int search = 3;
        boolean isMatch = false;
        

        for (int number : numbers) {
            if (number == search) {
                isMatch = true;
                break;
            }
        }

        if (isMatch) {
            System.out.println("number exist.");
        } else {
            System.out.println("number doesn't exist.");
        }
    }
}
