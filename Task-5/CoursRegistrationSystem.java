package Task5;

import java.util.ArrayList;
import java.util.Scanner;

public class CoursRegistrationSystem {

	static ArrayList<Course> courseList = new ArrayList<>();
    static ArrayList<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        courseList.add(new Course("CS101", "Introduction to Computer Science", "Basics of Computer Science", 30, "Mon-Wed-Fri 10:00AM-11:30AM"));
        courseList.add(new Course("MATH101", "Calculus I", "Introduction to Calculus", 25, "Tue-Thu 2:00PM-3:30PM"));
        courseList.add(new Course("PHY101", "Physics I", "Introduction to Physics", 20, "Mon-Wed 12:00PM-1:30PM"));

        
        studentList.add(new Student("S001", "John Doe"));

        int choice;
        do {
            System.out.println("\n Student Course Registration System");
            System.out.println("*******************************");
            System.out.println("1. List Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. Drop a Course");
            System.out.println("4. View Registered Courses");
            System.out.println("5. Exit");
            System.out.println("*******************************");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    listAvailableCourses();
                    break;
                case 2:
                    registerForCourse(scanner);
                    break;
                case 3:
                    dropCourse(scanner);
                    break;
                case 4:
                    viewRegisteredCourses();
                    break;
                case 5:
                    System.out.println("Thank You!!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }

    public static void listAvailableCourses() {
        System.out.println("\nAvailable Courses:");
        for (Course course : courseList) {
            course.displayCourseDetails();
        }
    }

    
    public static void registerForCourse(Scanner scanner) {
        Student student = findStudent("S001"); // For simplicity, using sample student ID
        if (student != null) {
            System.out.print("Enter the course code to register: ");
            String courseCode = scanner.nextLine();
            Course course = findCourse(courseCode);
            if (course != null) {
                student.registerCourse(course);
            } else {
                System.out.println("Course not found.");
            }
        }
    }

  
    public static void dropCourse(Scanner scanner) {
        Student student = findStudent("S001"); // For simplicity, using sample student ID
        if (student != null) {
            System.out.print("Enter the course code to drop: ");
            String courseCode = scanner.nextLine();
            Course course = findCourse(courseCode);
            if (course != null) {
                student.dropCourse(course);
            } else {
                System.out.println("Course not found.");
            }
        }
    }

    
    public static void viewRegisteredCourses() {
        Student student = findStudent("S001"); 
        if (student != null) {
            student.displayRegisteredCourses();
        }
    }

   
    public static Course findCourse(String courseCode) {
        for (Course course : courseList) {
            if (course.courseCode.equalsIgnoreCase(courseCode)) {
                return course;
            }
        }
        return null;
    }

    
    public static Student findStudent(String studentID) {
        for (Student student : studentList) {
            if (student.studentID.equals(studentID)) {
                return student;
            }
        }
        return null;
    }
}
