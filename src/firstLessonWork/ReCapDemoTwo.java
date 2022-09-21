 package firstLessonWork;

public class ReCapDemoTwo {
    public static void main(String[] args) {
        double[] myList = {1.2,1.3,1.4,1.5,1.6};
        double total =  0.0;
        double max = myList[0];
        for (double x : myList) {
            if (x > max){
                max = x;
            }
            total = total +  x;
            System.out.println(x);
        }
        System.out.println("Sum: " + total);
        System.out.println("Max Number: " + max);
    }
}
