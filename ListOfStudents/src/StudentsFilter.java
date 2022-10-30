public class StudentsFilter {
    public static void main(String[] args) {

        Student[] students = getStudents();

        printStudentsByFaculty("Faculty4", students);
        printStudentsByFacultyAndCourse("Faculty4", 4, students);
        printStudentsByTheYearOfBirth(1992, students);
        printStudentsByGroup(5, students);
    }

    public static void printStudentsByFaculty(String faculty, Student[] students) {
        System.out.println("Print students by faculty : ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                System.out.println(students[i]);
            }
        }
    }

    public static void printStudentsByFacultyAndCourse(String faculty, int course, Student[] students) {
        System.out.println("Print students by faculty and course : ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty) && students[i].getCourse() == course) {
                System.out.println(students[i]);
            }
        }
    }

    public static void printStudentsByTheYearOfBirth(int birthYear, Student[] students) {
        System.out.println("Print students by the year of birth : ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getYearOfBirth() > birthYear) {
                System.out.println(students[i]);
            }
        }
    }

    public static void printStudentsByGroup(int group, Student[] students) {
        System.out.println("Print students by group : ");
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup() == group) {
                System.out.println(students[i]);
            }
        }
    }
    public static Student[]
    getStudents(){
        Student student1 = new Student(1, "firstName1", "middleName1", "lastName1", 1993, "+380681111111", "Faculty1", 5, 1);
        Student student2 = new Student(2, "firstName2", "middleName2", "lastName2", 1992, "+380682222222", "Faculty2", 4, 2);
        Student student3 = new Student(3, "firstName3", "middleName3", "lastName3", 1995, "+380683333333", "Faculty3", 3, 5);
        Student student4 = new Student(4, "firstName4", "middleName4", "lastName4", 1993, "+380684444444", "Faculty1", 5, 3);
        Student student5 = new Student(5, "firstName5", "middleName5", "lastName5", 1992, "+380685555555", "Faculty4", 4, 7);
        Student student6 = new Student(6, "firstName6", "middleName6", "lastName6", 1993, "+380686666666", "Faculty5", 5, 12);
        Student student7 = new Student(7, "firstName7", "middleName7", "lastName7", 1995, "+380687777777", "Faculty3", 3, 5);
        Student student8 = new Student(8, "firstName8", "middleName8", "lastName8", 1992, "+380688888888", "Faculty1", 4, 4);
        Student student9 = new Student(9, "firstName9", "middleName9", "lastName9", 1993, "+380689999999", "Faculty6", 5, 34);
        Student student10 = new Student(10, "firstName10", "middleName10", "lastName10", 1991, "+380681000000", "Faculty4", 6, 12);
        return new Student[] {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
    }
}
