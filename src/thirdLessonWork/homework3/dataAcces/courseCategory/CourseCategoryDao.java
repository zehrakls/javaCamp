package thirdLessonWork.homework3.dataAcces.courseCategory;

import java.util.List;
import thirdLessonWork.homework3.entities.CourseCategory;


public interface CourseCategoryDao {
    void save(CourseCategory category);
    List<CourseCategory> getList();
}
