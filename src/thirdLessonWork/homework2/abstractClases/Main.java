package thirdLessonWork.homework2.abstractClases;

/**
 *
 * @author zehra.keles
 */
public class Main {

    public static void main(String[] args) {
        WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
        womenGameCalculator.hesapla();
        womenGameCalculator.gameOver();

        GameCalculator gameCalculator = new WomenGameCalculator();
    }
}
