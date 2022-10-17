package thirdLessonWork.homework3.business;

import java.util.List;
import thirdLessonWork.homework3.logging.Logger;
import thirdLessonWork.homework3.dataAcces.educator.EducatorDao;
import thirdLessonWork.homework3.entities.Educator;

public class EducatorManager{

    private EducatorDao educatorDao;
    private List<Logger> loggers;

    public EducatorManager(EducatorDao educatorDao, List<Logger> loggers) {
        this.educatorDao = educatorDao;
        this.loggers = loggers;
    }

    public void save(Educator educator) throws Exception {

        educatorDao.save(educator);
        for (Logger logger : loggers) {
            logger.logger(educator.getEducatorName());
        }

    }
}
