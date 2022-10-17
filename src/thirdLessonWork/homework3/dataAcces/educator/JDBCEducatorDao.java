package thirdLessonWork.homework3.dataAcces.educator;

import thirdLessonWork.homework3.entities.Educator;

public class JDBCEducatorDao implements EducatorDao {

    @Override
    public void save(Educator educator) {
        System.out.println("Educator JDBC ile kaydedildi");
    }

}
