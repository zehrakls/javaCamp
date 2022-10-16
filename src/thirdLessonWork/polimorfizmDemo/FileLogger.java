package thirdLessonWork.polimorfizmDemo;

/**
 *
 * @author zehra.keles
 */
public class FileLogger extends BaseLogger{
    public void log(String message) {
        System.out.println("Logged to file: " +message);
    }
}
