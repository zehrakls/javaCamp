package thirdLessonWork.homework2.overriding;

/**
 *
 * @author zehra.keles
 */
public class OgrenciKrediManager extends BaseKrediManager {

    @Override
    public double hesapla(double tutar) {
        return tutar * 1.1;
    }

}
