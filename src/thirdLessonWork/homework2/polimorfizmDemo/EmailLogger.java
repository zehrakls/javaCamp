package thirdLessonWork.homework2.polimorfizmDemo;

/**
 *
 * @author zehra.keles
 */
public class EmailLogger extends BaseLogger{
    public void log(String message) {
        System.out.println("Logged to email: " +message);
    }
}
