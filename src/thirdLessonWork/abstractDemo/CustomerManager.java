package thirdLessonWork.abstractDemo;

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
