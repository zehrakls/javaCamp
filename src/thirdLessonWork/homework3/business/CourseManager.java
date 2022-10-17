package thirdLessonWork.homework3.business;

import java.util.List;
import thirdLessonWork.homework3.entities.Course;
import thirdLessonWork.homework3.logging.Logger;
import thirdLessonWork.homework3.dataAcces.course.CourseDao;

public class CourseManager{

    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao coursesDao, List<Logger> loggers) {
        this.courseDao = coursesDao;
        this.loggers = loggers;
    }

    public void save(Course course) throws Exception {

        if (course.getCoursePrice() <= 0) {
            System.out.println("Course price sıfırdan büyük olmalıdır!!");
            return;
        }

        List<Course> courseses = courseDao.getList();

        for (Course courses : courseses) {
            if (course.getCourseName().equals(courses.getCourseName())) {
                System.out.println("Course name farklı olmalıdır!!");
                return;
            }
        }

        courseDao.save(course);

        for (Logger logger : loggers) {
            logger.logger(course.getCourseName());
        }

    }
}
