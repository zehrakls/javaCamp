package thirdLessonWork.homework3.dataAcces.course;

import java.util.ArrayList;
import java.util.List;
import thirdLessonWork.homework3.entities.Course;

public class JDBCCourseDao implements CourseDao {

    @Override
    public void save(Course course) {
        System.out.println("Course JDBC ile veritabanına eklendi: " +course.getCourseName());
    }

    @Override
    public List<Course> getList() {
        List<Course> courseses = new ArrayList<>();
        courseses.add(new Course(1, "Java", 1000.0));
        courseses.add(new Course(2, "Pyhton", 1000.0));
        return courseses;
    }
}
