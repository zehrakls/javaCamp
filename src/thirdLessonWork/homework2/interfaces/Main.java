package thirdLessonWork.homework2.interfaces;

/**
 *
 * @author zehra.keles
 */
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();
        
    }
}
