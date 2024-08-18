package Task5;

import java.util.ArrayList;

public class Student {

	String studentID;
    String name;
    ArrayList<Course> registeredCourses;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }
    
    public void registerCourse(Course course) {
        if (!registeredCourses.contains(course) && course.CheckAvailableSlots()) {
            registeredCourses.add(course);
            course.enrollStudent();
            System.out.println("Course registered successfully.");
            System.out.println("###############################");
        } else {
            System.out.println("Course could not be registered (either full or already registered).");
        }
    }
    
    
    public void dropCourse(Course course) {
        if (registeredCourses.contains(course)) {
            registeredCourses.remove(course);
            course.removeStudent();
            System.out.println("Course dropped successfully.");
            System.out.println("###############################");
        } else {
            System.out.println("Course not found in your registered courses.");
        }
    }
    
    
    public void displayRegisteredCourses() {
        if (registeredCourses.isEmpty()) {
            System.out.println("No courses registered.");
        } else {
            System.out.println("Registered Courses:");
            for (Course course : registeredCourses) {
                System.out.println(course.title + " (" + course.courseCode + ")");
            }
        }
    }

}


