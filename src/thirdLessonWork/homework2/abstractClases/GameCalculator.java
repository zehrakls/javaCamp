package thirdLessonWork.homework2.abstractClases;

/**
 *
 * @author zehra.keles
 */
public abstract class GameCalculator {
    public abstract void hesapla();
    
    public final void gameOver(){
        System.out.println("Oyun Bitti");
    }
}
