package thirdLessonWork.homework3.dataAcces.course;

import java.util.List;
import thirdLessonWork.homework3.entities.Course;

public interface CourseDao {
    void save(Course course);
    List<Course> getList();
}
