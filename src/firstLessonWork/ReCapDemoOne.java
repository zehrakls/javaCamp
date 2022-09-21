package firstLessonWork;

public class ReCapDemoOne {
    public static void main(String[] args) {
        int number1=40;
        int number2 = 15;
        int number3 = 66;
        int mostBigger = number1;
        if(mostBigger<number2){
            mostBigger=number2;
        } else if (mostBigger<number3) {
            mostBigger=number3;
        }
        System.out.println(mostBigger);
    }
}
