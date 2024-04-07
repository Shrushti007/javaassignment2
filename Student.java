package assignment1;

public class Student {
    private int rollNo;
    private String name;
    private String course;
    private int mark;
    private char grade;
    private String result;

    // Function to assign values for rollNo, name, course, and mark
    public void setStudentDetails(int rollNo, String name, String course, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.mark = mark;
    }

    // Function to find out the grade for the student
    public void calculateGrade() {
        if (mark > 90) {
            grade = 'A';
        } else if (mark >= 80 && mark <= 90) {
            grade = 'B';
        } else if (mark >= 70 && mark < 80) {
            grade = 'C';
        } else if (mark >= 60 && mark < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    // Function to find the result of the student
    public void calculateResult() {
        if (mark > 60) {
            result = "Pass";
        } else {
            result = "Fail";
        }
    }

    // Function to print out the details of the student
    public void printStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Mark: " + mark);
        System.out.println("Grade: " + grade);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        // Create an object of Student class
        Student student = new Student();
        
        // Assign values for rollNo, name, course, and mark
        student.setStudentDetails(101, "Raj", "Mathematics", 90);
        
        // Calculate grade and result
        student.calculateGrade();
        student.calculateResult();
        
        // Print student details
        student.printStudentDetails();
    }
}