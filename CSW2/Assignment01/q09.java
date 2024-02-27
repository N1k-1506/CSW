// Student class representing a university student
class Student2{
    private String studentId;
    private String name;

    public Student2(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

// Course class representing a university course
class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }
}

// Enrollment class managing student enrollment in courses
class Enrollment {
    public void enrollStudent(Student2 student, Course course) {
        System.out.println("Enrolling student " + student.getName() + " in course " + course.getCourseName());
    }

    public void dropStudent(Student2 student, Course course) {
        System.out.println("Dropping student " + student.getName() + " from course " + course.getCourseName());
    }
}

// Main class to demonstrate the enrollment system
public class q09 {
    public static void main(String[] args) {
        Enrollment enrollmentSystem = new Enrollment();

        // Create some students
        Student2 student1 = new Student2("001", "Alice");
        Student2 student2 = new Student2("002", "Bob");

        // Create some courses
        Course course1 = new Course("CSCI101", "Introduction to Computer Science");
        Course course2 = new Course("MATH101", "Calculus");

        // Enroll students in courses
        enrollmentSystem.enrollStudent(student1, course1);
        enrollmentSystem.enrollStudent(student1, course2);
        enrollmentSystem.enrollStudent(student2, course1);

        // Drop a student from a course
        enrollmentSystem.dropStudent(student1, course1);
    }
}

/*Loose coupling: There's no need for data structures like Map or List to maintain loose coupling. Instead, the Enrollment class directly interacts with Student and Course objects through method calls. This allows for flexibility in changing the implementation details of the Enrollment class without affecting the Student and Course classes.

High cohesion: Each class (Student, Course, Enrollment) has a single, well-defined responsibility. The Student class represents a university student, the Course class represents a university course, and the Enrollment class manages the enrollment of students in courses. Each class contains methods that are closely related to its responsibility, promoting high cohesion within each class. */