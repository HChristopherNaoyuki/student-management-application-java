package Solution;

// StudentManagementApplication.java
//
// This file defines the StudentManagementApplication class, which provides a simple
// console-based application for managing student records. The application allows users
// to capture new student details, search for students by their ID, delete student records,
// and print a report of all students. It uses a menu-driven interface to guide the user
// through these operations.
// 
// Main functionalities:
// - Displaying a menu with options to capture, search, delete, print reports, and exit.
// - Capturing new student details and saving them.
// - Validating student age input to ensure it is a valid number and within the acceptable range.
// - Searching for students by their ID and displaying their details.
// - Deleting student records after user confirmation.
// - Generating and displaying a report of all student records.

import java.util.Scanner;

public class StudentManagementApplication 
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        // Initial greeting and menu prompt
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("*************************************************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        System.out.println("    ");

        // Capture initial user choice to either launch the menu or exit
        String initialChoice = scanner.nextLine();
        if (!"1".equals(initialChoice)) 
        {
            // If user does not enter '1', exit the application
            System.out.println("Exiting the application. Goodbye!");
            System.exit(0);
        }

        // Main application loop to continually display menu and handle user choices
        while (true) 
        {
            showMenu(); // Display the main menu
            String choice = scanner.nextLine(); // Read user input

            // Handle user choice using a switch statement
            switch (choice) 
            {
                case "1":
                    captureStudent(); // Handle new student entry
                    break;
                case "2":
                    searchStudent(); // Search for an existing student
                    break;
                case "3":
                    deleteStudent(); // Delete a student record
                    break;
                case "4":
                    Student.StudentReport(); // Generate and display a student report
                    break;
                case "5":
                    Student.ExitStudentApplication(); // Exit the application
                    break;
                default:
                    // Handle invalid input
                    System.out.println("Invalid choice! Please enter a valid menu option.");
            }
        }
    }

    // Displays the main menu to the user with available options
    private static void showMenu() 
    {
        System.out.println("    ");
        System.out.println("Please select one of the following menu items:");
        System.out.println("(1) Capture a new student.");
        System.out.println("(2) Search for a student.");
        System.out.println("(3) Delete a student.");
        System.out.println("(4) Print student report.");
        System.out.println("(5) Exit Application.");
        System.out.println("    ");
    }

    // Prompts the user to enter details for a new student and saves the student record
    private static void captureStudent() 
    {
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("*****************************");

        // Prompt user for student details
        System.out.print("Enter the student id: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        // Capture and validate student age
        int age = captureStudentAge();

        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();

        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();

        // Create a new Student object with the provided details
        Student student = new Student(studentId, name, age, email, course);
        // Save the student record
        Student.SaveStudent(student);
    }

    // Captures and validates the student's age to ensure it is a number and within the acceptable range
    private static int captureStudentAge() 
    {
        int age = 0;
        boolean validAge = false;
        while (!validAge) 
        {
            System.out.print("Enter the student age: ");
            String ageInput = scanner.nextLine();
            try 
            {
                // Attempt to parse age input as an integer
                age = Integer.parseInt(ageInput);
                // Check if age is within the valid range
                if (age < 16) 
                {
                    System.out.println("You have entered an incorrect student age!!!");
                    System.out.println("Please re-enter the student age >>");
                }
                else 
                {
                    validAge = true; // Age is valid if it is 16 or older
                }
            } 
            catch (NumberFormatException e) 
            {
                // Handle non-integer age input
                System.out.println("You have entered an incorrect student age!!!");
                System.out.println("Please re-enter the student age >>");
            }
        }
        return age;
    }

    // Searches for a student by their ID and displays their details if found
    private static void searchStudent() 
    {
        System.out.print("Enter the student id to search: ");
        String studentId = scanner.nextLine();

        // Search for the student in the list
        Student student = Student.SearchStudent(studentId);
        if (student != null) 
        {
            // Display student details if found
            System.out.println("---------------------------------------------");
            System.out.println("STUDENT ID: " + student.getStudentId());
            System.out.println("STUDENT NAME: " + student.getName());
            System.out.println("STUDENT AGE: " + student.getAge());
            System.out.println("STUDENT EMAIL: " + student.getEmail());
            System.out.println("STUDENT COURSE: " + student.getCourse());
            System.out.println("---------------------------------------------");
        } 
        else 
        {
            // Notify user if student was not found
            System.out.println("---------------------------------------------");
            System.out.println("Student with Student Id: " + studentId + " was not found!");
            System.out.println("---------------------------------------------");
        }
    }

    // Prompts the user to confirm and then deletes a student record based on the provided ID
    private static void deleteStudent() 
    {
        System.out.print("Enter the student id to delete: ");
        String studentId = scanner.nextLine();

        // Ask for confirmation before deleting the student record
        System.out.println("Are you sure you want to delete student " + studentId + " from the system? Yes (y) to delete.");
        String confirmation = scanner.nextLine();

        if ("y".equalsIgnoreCase(confirmation)) 
        {
            // Attempt to delete the student
            boolean success = Student.DeleteStudent(studentId);
            if (success) 
            {
                System.out.println("---------------------------------------------");
                System.out.println("Student with Student Id: " + studentId + " WAS deleted!");
                System.out.println("---------------------------------------------");
            } 
            else 
            {
                System.out.println("---------------------------------------------");
                System.out.println("Student with Student Id: " + studentId + " was not found!");
                System.out.println("---------------------------------------------");
            }
        }
    }
}