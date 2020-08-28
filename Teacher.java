public class Teacher {

    private String teacherName;
    private long teacherPersonalNumber;
    private int teacherAge;
    private int yearsInSchool;
    private int averageStudentsInClass;

    public Teacher (String teacherName) {
        this(teacherName, 1122334455, 48, 18,23);
    }

    public Teacher(String teacherName, long teacherPersonalNumber, int teacherAge, int yearsInSchool, int averageStudentsInClass) {
        this.teacherName = teacherName;
        this.teacherPersonalNumber = teacherPersonalNumber;
        this.teacherAge = teacherAge;
        this.yearsInSchool = yearsInSchool;
        this.averageStudentsInClass = averageStudentsInClass;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public long getTeacherPersonalNumber() {
        return teacherPersonalNumber;
    }

    public int getTeacherAge() {
        return teacherAge;
    }

    public int getYearsInSchool() {
        return yearsInSchool;
    }

    public int getAverageStudentsInClass() {
        return averageStudentsInClass;
    }

    public void setYearsInSchool(int yearsInSchool) {
        this.yearsInSchool = yearsInSchool;
    }

    public void setAverageStudentsInClass(int averageStudentsInClass) {
        this.averageStudentsInClass = averageStudentsInClass;
    }

    public void newYearInSchool() {
        yearsInSchool++;
    }

}
