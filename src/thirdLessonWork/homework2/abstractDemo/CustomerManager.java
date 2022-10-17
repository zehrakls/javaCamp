package thirdLessonWork.homework2.abstractDemo;

/**
 *
 * @author zehra.keles
 */
public class CustomerManager {
    
    BaseDatabaseManager baseDatabaseManager;
    
    public void getCustomers() {
       baseDatabaseManager.getData();
    }

}
