package thirdLessonWork.homework3.dataAcces.courseCategory;

import java.util.ArrayList;
import java.util.List;
import thirdLessonWork.homework3.entities.CourseCategory;

public class JDBCCourseCategoryDao implements CourseCategoryDao {

    @Override
    public void save(CourseCategory category) {
        System.out.println("Course Category JDBC ile kaydedildi");
    }
    
    @Override
    public List<CourseCategory> getList() {
        List<CourseCategory> categorys = new ArrayList<>();
        categorys.add(new CourseCategory("Software"));
        categorys.add(new CourseCategory("Database"));
        return categorys;
    }

}
