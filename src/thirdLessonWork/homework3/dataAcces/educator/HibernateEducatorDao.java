package thirdLessonWork.homework3.dataAcces.educator;

import thirdLessonWork.homework3.entities.Educator;

public class HibernateEducatorDao implements EducatorDao {

    @Override
    public void save(Educator educator) {
        System.out.println("Educator Hibernate ile kaydedildi");
    }

}
