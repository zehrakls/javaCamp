package thirdLessonWork.homework3.logging;

public class FileLogger implements Logger{

    @Override
    public void logger(String message) {
        System.out.println("Dosyaya loglandı: " + message);

    }
}
