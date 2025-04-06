package Q_05;

public class Main {
    public static void main(String[] args) {
        Course oop=new Course();
        oop.setCourseName("Object Oriented Programme");
        oop.setCourseCode("CTEC 22043");

        Lecturer kumar=new Lecturer();
        kumar.setLecturerName("kumar");
        kumar.setCourseTeaching("Object Oriented Programme");

        Student Sanga=new Student();
        Sanga.setStudentName("yapa");
        Sanga.setDegreeName("ICT");
        Sanga.setCourseFollowing("Object Oriented Programme");

        System.out.println("Student Details: ");
        System.out.println("Student Name: "+Sanga.getStudentName());
        System.out.println("Degree Name: "+Sanga.getDegreeName());
        System.out.println("Course Name: "+Sanga.getCourseFollowing());

        System.out.println("Course Details: ");
        System.out.println("Course Name: "+oop.getCourseName());
        System.out.println("Course Code: "+oop.getCourseCode());

        System.out.println("Lecturer Details: ");
        System.out.println("Lecturer name: "+kumar.getLecturerName());
        System.out.println("Course Teaching: "+kumar.getCourseTeaching());

    }
}
