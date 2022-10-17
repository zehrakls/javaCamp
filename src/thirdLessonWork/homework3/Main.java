package thirdLessonWork.homework3;

import java.util.ArrayList;
import java.util.List;
import thirdLessonWork.homework3.business.CourseCategoryManager;
import thirdLessonWork.homework3.business.CourseManager;
import thirdLessonWork.homework3.business.EducatorManager;
import thirdLessonWork.homework3.dataAcces.course.HibernateCourseDao;
import thirdLessonWork.homework3.dataAcces.course.JDBCCourseDao;
import thirdLessonWork.homework3.dataAcces.courseCategory.HibernateCourseCategoryDao;
import thirdLessonWork.homework3.dataAcces.courseCategory.JDBCCourseCategoryDao;
import thirdLessonWork.homework3.dataAcces.educator.HibernateEducatorDao;
import thirdLessonWork.homework3.dataAcces.educator.JDBCEducatorDao;
import thirdLessonWork.homework3.entities.CourseCategory;
import thirdLessonWork.homework3.entities.Course;
import thirdLessonWork.homework3.entities.Educator;
import thirdLessonWork.homework3.logging.DatabaseLogger;
import thirdLessonWork.homework3.logging.FileLogger;
import thirdLessonWork.homework3.logging.Logger;
import thirdLessonWork.homework3.logging.MailLogger;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Logger> loggers = new ArrayList<>();
        loggers.add(new DatabaseLogger());
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());

        Course course1 = new Course(3, "Java", 10);
        Course course2 = new Course(4, "Php", 20);
        Course course3 = new Course(5, "C#", -1);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.save(course1);
        courseManager.save(course2);
        courseManager.save(course3);

        courseManager = new CourseManager(new JDBCCourseDao(), loggers);
        courseManager.save(course1);
        courseManager.save(course2);
        courseManager.save(course3);

        CourseCategoryManager courseCategoryManager = new CourseCategoryManager(new HibernateCourseCategoryDao(), loggers);

        CourseCategory courseCategory1 = new CourseCategory("Software");
        CourseCategory courseCategory2 = new CourseCategory("Hardware");
        courseCategoryManager.save(courseCategory1);
        courseCategoryManager.save(courseCategory2);
        
        courseCategoryManager = new CourseCategoryManager(new JDBCCourseCategoryDao(), loggers);
        
        EducatorManager educatorManager=new EducatorManager(new HibernateEducatorDao(), loggers);
        Educator educator1 = new Educator(1, "Zehra");
        Educator educator2 = new Educator(2, "Aycan");
        educatorManager.save(educator1);
        educatorManager.save(educator2);
        
        educatorManager=new EducatorManager(new JDBCEducatorDao(), loggers);
        educatorManager.save(educator1);
        educatorManager.save(educator2);
    }
}
