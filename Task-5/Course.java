package Task5;

public class Course {
	String courseCode;
    String title;
    String description;
    int capacity;
    String schedule;
    int enrolledStudents;
    
    public Course(String courseCode, String title, String description, int capacity, String schedule) 
    {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;
        this.enrolledStudents = 0;
    }
    
    
    public boolean CheckAvailableSlots() {
        return enrolledStudents < capacity;
    }
    
    public void enrollStudent() {
        if (CheckAvailableSlots()) {
            enrolledStudents++;
        }
    }
    
    public void removeStudent() {
        if (enrolledStudents > 0) {
            enrolledStudents--;
        }
    }
    
    public void displayCourseDetails() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Schedule: " + schedule);
        System.out.println("Capacity: " + capacity);
        System.out.println("Enrolled Students: " + enrolledStudents);
        System.out.println("Available Slots: " + (capacity - enrolledStudents));
        System.out.println("*************************");
    }
}
