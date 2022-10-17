package thirdLessonWork.homework3.business;

import java.util.List;
import thirdLessonWork.homework3.dataAcces.courseCategory.CourseCategoryDao;
import thirdLessonWork.homework3.entities.CourseCategory;
import thirdLessonWork.homework3.logging.Logger;

public class CourseCategoryManager{

    private CourseCategoryDao courseCategoryDao;
    private List<Logger> loggers;

    public CourseCategoryManager(CourseCategoryDao courseCategoryDao, List<Logger> loggers) {
        this.courseCategoryDao = courseCategoryDao;
        this.loggers = loggers;
    }

    public void save(CourseCategory courseCategory) throws Exception {

        List<CourseCategory> courseCategorys = courseCategoryDao.getList();

        for (CourseCategory category : courseCategorys) {
            if (category.getCategoryName().equals(courseCategory.getCategoryName())) {
                System.out.println("Course Category Name farklı olmalıdır!!");
                return;
            }
        }

        courseCategoryDao.save(courseCategory);

        for (Logger logger : loggers) {
            logger.logger(courseCategory.getCategoryName());
        }

    }
}
