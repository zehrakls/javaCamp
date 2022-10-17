package thirdLessonWork.homework3.entities;

public class Educator {
    int educatorId;
    String educatorName;

    public Educator(int educatorId, String educatorName) {
        this.educatorId = educatorId;
        this.educatorName = educatorName;
    }

    public int getEducatorId() {
        return educatorId;
    }

    public void setEducatorId(int educatorId) {
        this.educatorId = educatorId;
    }

    public String getEducatorName() {
        return educatorName;
    }

    public void setEducatorName(String educatorName) {
        this.educatorName = educatorName;
    }
}
