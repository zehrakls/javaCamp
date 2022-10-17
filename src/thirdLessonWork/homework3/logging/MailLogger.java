package thirdLessonWork.homework3.logging;

public class MailLogger implements Logger{

    @Override
    public void logger(String message) {
        System.out.println("Mail gönderildi: " + message);
    }
}
