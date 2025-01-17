package Solution;

// Student.java
//
// This file defines the Student class which represents a student record in a student
// management application. The Student class includes attributes for student ID, name,
// age, email, and course. It also provides methods to save, search, delete, and generate
// reports for student records. All student records are stored in a static list within the
// class.

import java.util.ArrayList;

public class Student 
{
    private String studentId;   // Unique identifier for each student
    private String name;        // Name of the student
    private int age;            // Age of the student
    private String email;       // Email address of the student
    private String course;      // Course the student is enrolled in

    // Static list to hold all student records
    private static ArrayList<Student> students = new ArrayList<>();

    // Constructor to initialize a new Student object with given details
    public Student(String studentId, String name, int age, String email, String course) 
    {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    /**
     * Saves a student to the static list of students.
     * 
     * @param student The student object to be added to the list.
     */
    public static void SaveStudent(Student student) 
    {
        students.add(student);    // Add the student to the list
        System.out.println("Student details have been successfully saved."); // Confirmation message
    }

    /**
     * Searches for a student by their unique student ID.
     * 
     * @param studentId The ID of the student to search for.
     * @return The student object if found, otherwise returns null.
     */
    public static Student SearchStudent(String studentId) 
    {
        // Iterate through the list to find the student with the given ID
        for (Student student : students) 
        {
            if (student.getStudentId().equals(studentId)) 
            {
                return student; // Return the student if found
            }
        }
        return null; // Return null if no matching student is found
    }

    /**
     * Deletes a student from the static list based on their unique student ID.
     * 
     * @param studentId The ID of the student to be deleted.
     * @return True if the student was successfully removed, otherwise returns false.
     */
    public static boolean DeleteStudent(String studentId) 
    {
        // Search for the student in the list
        Student student = SearchStudent(studentId);
        if (student != null) 
        {
            students.remove(student); // Remove the student if found
            return true; // Indicate successful deletion
        }
        return false; // Indicate that no student was found for deletion
    }

    /**
     * Prints a report of all students in the static list.
     * The report includes the student ID, name, age, email, and course.
     */
    public static void StudentReport() 
    {
        int count = 1; // Counter to number the students in the report
        // Iterate through the list and print the details of each student
        for (Student student : students) 
        {
            System.out.println("STUDENT " + count); // Print the student number
            System.out.println("------------------------------"); // Separator
            System.out.println("STUDENT ID: " + student.getStudentId()); // Print the student ID
            System.out.println("STUDENT NAME: " + student.getName()); // Print the student name
            System.out.println("STUDENT AGE: " + student.getAge()); // Print the student age
            System.out.println("STUDENT EMAIL: " + student.getEmail()); // Print the student email
            System.out.println("STUDENT COURSE: " + student.getCourse()); // Print the student course
            System.out.println("------------------------------"); // Separator
            count++; // Increment the student counter
        }
    }

    /**
     * Exits the application with a farewell message.
     * This method terminates the program execution.
     */
    public static void ExitStudentApplication() 
    {
        System.out.println("Exiting the application. Goodbye!"); // Farewell message
        System.exit(0); // Terminate the program
    }

    // Getter methods for accessing the student attributes

    public String getStudentId() 
    {
        return studentId;
    }

    public String getName() 
    {
        return name;
    }

    public int getAge() 
    {
        return age;
    }

    public String getEmail() 
    {
        return email;
    }

    public String getCourse() 
    {
        return course;
    }
}