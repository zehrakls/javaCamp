package thirdLessonWork.interfaces;

/**
 *
 * @author zehra.keles
 */
public class OracleCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Oracle ile eklendi.");
    }
    
}
