package thirdLessonWork.homework2.polimorfizmDemo;

/**
 *
 * @author zehra.keles
 */
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
