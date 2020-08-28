public class Student {

    private String studentName;
    private long studentPersonalNumber;
    private byte studentAge;
    private int whichClass;
    private String schoolName;

    public Student (String studentName, String schoolName) {
        this(studentName, 1234567888, (byte) 21, 2, schoolName);
    }

    public Student(String studentName, long studentPersonalNumber, byte studentAge, int whichClass, String schoolName) {
        this.studentName = studentName;
        this.studentPersonalNumber = studentPersonalNumber;
        this.studentAge = studentAge;
        this.whichClass = whichClass;
        this.schoolName = schoolName;
    }

    public String getStudentName() {
        return studentName;
    }

    public long getStudentPersonalNumber() {
        return studentPersonalNumber;
    }

    public byte getStudentAge() {
        return studentAge;
    }

    public int getWhichClass() {
    return whichClass;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setStudentName(String newStudentName) {
        studentName = newStudentName;
    }

    public void setStudentAge(byte newStudentAge) {
        studentAge = newStudentAge;
    }

    public void setSchoolName(String newSchoolName) {
        schoolName = newSchoolName;
    }

    public void newClassInSchool() {
        whichClass++;
    }
}
