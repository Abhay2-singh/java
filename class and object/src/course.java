public class course {
    static int  maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudent;

    course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.enrolledStudent=new String[maxCapacity];

    }

    static void setMaxCapacity(int maxCapacity){
        course.maxCapacity=maxCapacity;
    }
    void enrollStudent(String studentName){
        enrolledStudent[enrollments]=studentName;
        enrollments++;
    }
    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }

}
