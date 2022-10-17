package thirdLessonWork.homework2.abstractDemo;

/**
 *
 * @author zehra.keles
 */
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        customerManager.baseDatabaseManager= new OracleDatabaseManager();
        customerManager.getCustomers();
    }
}
