package thirdLessonWork.homework2.polimorfizmDemo;

/**
 *
 * @author zehra.keles
 */
public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger baseLogger) {
        this.logger = baseLogger;
    }

    public void add() {
        System.out.println("müşteri eklendi.");
        this.logger.log("logged");
    }
}
