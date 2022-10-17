package thirdLessonWork.homework3.logging;

import java.util.List;

public class DatabaseLogger implements Logger {
    @Override
    public void logger(String message) {
        System.out.println("Database eklendi: " + message);
    }
}
