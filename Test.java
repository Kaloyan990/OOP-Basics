public class Test {
    public static void main(String[] args) {

        Human ivan = new Human("Иван");
        System.out.println(ivan.getName() + "," + ivan.getAge() + "," + ivan.getEgn());

        Student todor = new Student("Тодор", "СОУ Иван Асен II");
        System.out.println(todor.getStudentName() + "," +
                todor.getStudentAge() + "," +
                todor.getStudentPersonalNumber() + "," +
                todor.getWhichClass() + "," +
                todor.getSchoolName());

        Teacher mitko = new Teacher("Чичо Митко");
        System.out.println(mitko.getTeacherName() + "," +
                mitko.getTeacherPersonalNumber() + "," +
                mitko.getTeacherAge() + "," +
                mitko.getYearsInSchool() + "," +
                mitko.getAverageStudentsInClass());
    }
}
