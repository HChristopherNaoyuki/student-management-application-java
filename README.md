# Student Management Application

The **Student Management Application** is a simple console-based program for managing student records. This project provides functionality for capturing, searching, deleting, and generating reports of student records. It is built in Java and includes unit tests using JUnit for ensuring functionality.

## Features

- **Capture New Student**: Add new student records with details like ID, name, age, email, and course.
- **Search Student**: Retrieve student details by their unique ID.
- **Delete Student**: Remove a student record by ID after confirmation.
- **Generate Student Report**: Display a detailed report of all stored student records.
- **Exit Application**: Gracefully terminate the program.

## Project Structure

Solution/
├── Student.java                   # Defines the Student class and its operations.
├── StudentManagementApplication.java # The main application with menu-driven functionality.
└── StudentTest.java               # JUnit tests for the Student class methods.

### Class Descriptions

1. **`Student.java`**  
   Represents a student record with attributes:
   - `studentId`
   - `name`
   - `age`
   - `email`
   - `course`

   Provides static methods to:
   - Save a student: `SaveStudent()`
   - Search for a student: `SearchStudent()`
   - Delete a student: `DeleteStudent()`
   - Generate a report: `StudentReport()`

2. **`StudentManagementApplication.java`**  
   Implements a menu-driven interface for:
   - Capturing student details.
   - Searching for students by ID.
   - Deleting student records.
   - Printing student reports.
   - Exiting the application.

3. **`StudentTest.java`**  
   Unit tests for:
   - Saving, searching, and deleting student records.
   - Validating student age input.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/student-management-application-java.git
   cd student-management-application
   ```

2. Compile the Java files:
   ```bash
   javac Solution/*.java
   ```

3. Run the application:
   ```bash
   java Solution.StudentManagementApplication
   ```

4. To run the tests, use a JUnit 4-compatible environment (e.g., IntelliJ IDEA or Eclipse).

## Sample Usage

### Menu
When you run the application, you'll see the following menu:
```plaintext
Please select one of the following menu items:
(1) Capture a new student.
(2) Search for a student.
(3) Delete a student.
(4) Print student report.
(5) Exit Application.
```

### Example Output
#### Adding a Student
```plaintext
Enter the student id: 10111
Enter the student name: Jane Doe
Enter the student age: 20
Enter the student email: jane.doe@example.com
Enter the student course: Computer Science
Student details have been successfully saved.
```

#### Searching for a Student
```plaintext
Enter the student id to search: 10111
---------------------------------------------
STUDENT ID: 10111
STUDENT NAME: Jane Doe
STUDENT AGE: 20
STUDENT EMAIL: jane.doe@example.com
STUDENT COURSE: Computer Science
---------------------------------------------
```

#### Generating a Report
```plaintext
STUDENT 1
------------------------------
STUDENT ID: 10111
STUDENT NAME: Jane Doe
STUDENT AGE: 20
STUDENT EMAIL: jane.doe@example.com
STUDENT COURSE: Computer Science
------------------------------
```

## Testing

Unit tests are provided in the `StudentTest.java` file. They verify:
- Saving and retrieving students.
- Searching for existing and non-existing students.
- Deleting students.
- Handling invalid input (e.g., invalid age).

### Run Tests
Use a JUnit 4-compatible IDE or testing tool to run the tests.
