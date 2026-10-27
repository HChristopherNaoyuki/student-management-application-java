# Student Management Application

The Student Management Application is a simple console-based program for
managing student records. This project provides functionality for capturing,
searching, deleting, and generating reports of student records. It is built in
Java and includes unit tests using JUnit for ensuring functionality.

## Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Class Descriptions](#class-descriptions)
- [How to Run](#how-to-run)
- [Sample Usage](#sample-usage)
- [Testing](#testing)
- [Disclaimer](#disclaimer)

## Features

- Capture New Student: Add new student records with details like ID, name, age,
  email, and course.
- Search Student: Retrieve student details by their unique ID.
- Delete Student: Remove a student record by ID after confirmation.
- Generate Student Report: Display a detailed report of all stored student
  records.
- Exit Application: Gracefully terminate the program.

## Project Structure

```bash
Solution/
├── Student.java                      # Defines the Student class and its operations.
├── StudentManagementApplication.java # The main application with menu-driven functionality.
└── StudentTest.java                  # JUnit tests for the Student class methods.
```

## Class Descriptions

### 1. Student.java

Represents a student record with the following attributes:

- `studentId`
- `name`
- `age`
- `email`
- `course`

Provides the following static methods:

- `SaveStudent()`: Adds a new student record to the system.
- `SearchStudent()`: Retrieves a student record using the student ID.
- `DeleteStudent()`: Removes a student record after confirmation.
- `StudentReport()`: Generates a formatted report of all stored student records.

### 2. StudentManagementApplication.java

Implements a menu-driven console interface that allows users to:

- Capture new student details.
- Search for existing students by ID.
- Delete student records.
- Print a complete student report.
- Exit the application cleanly.

### 3. StudentTest.java

Contains unit tests that verify:

- Saving, searching, and deleting student records.
- Validation logic for student age input.

## How to Run

Follow these steps to compile and execute the application:

1. Clone the repository using the following command:

   ```bash
   git clone https://github.com/HChristopherNaoyuki/student-management-application-java.git
   cd student-management-application-java
   ```

2. Compile all Java files located in the Solution directory:

   ```bash
   javac Solution/*.java
   ```

3. Run the main application:

   ```bash
   java Solution.StudentManagementApplication
   ```

4. To execute the unit tests, use a JUnit 4 compatible environment such as
   IntelliJ IDEA, Eclipse, or run via a build tool like Maven or Gradle
   configured for JUnit 4.

## Sample Usage

### Menu

When you start the application, the following menu is displayed:

```plaintext
Please select one of the following menu items:
(1) Capture a new student.
(2) Search for a student.
(3) Delete a student.
(4) Print student report.
(5) Exit Application.
```

### Adding a Student

```plaintext
Enter the student id: 10111
Enter the student name: Jane Doe
Enter the student age: 20
Enter the student email: jane.doe@example.com
Enter the student course: Computer Science
Student details have been successfully saved.
```

### Searching for a Student

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

### Generating a Report

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

Unit tests are provided in the `StudentTest.java` file. These tests verify the
following functionality:

- Saving and retrieving student records.
- Searching for existing and non-existing student IDs.
- Deleting student records.
- Handling invalid input, such as an invalid age value.

### Run Tests

Use a JUnit 4 compatible IDE or testing tool to execute the tests. If using the
command line with JUnit 4, include the JUnit 4 JAR file in your classpath.

## Disclaimer

```
UNDER NO CIRCUMSTANCES SHOULD IMAGES OR EMOJIS BE INCLUDED DIRECTLY IN
THIS FILE. ALL VISUAL MEDIA, INCLUDING SCREENSHOTS AND IMAGES OF THE
APPLICATION, MUST BE STORED IN A DEDICATED FOLDER WITHIN THE PROJECT
DIRECTORY. THIS FOLDER SHOULD BE CLEARLY STRUCTURED AND NAMED
ACCORDINGLY TO INDICATE THAT IT CONTAINS ALL VISUAL CONTENT RELATED TO
THE APPLICATION, FOR EXAMPLE A FOLDER NAMED IMAGES, SCREENSHOTS, OR
MEDIA. THE AUTHOR IS NOT LIABLE OR RESPONSIBLE FOR ANY MALFUNCTIONS,
DEFECTS, OR ISSUES THAT MAY OCCUR AS A RESULT OF COPYING, MODIFYING, OR
USING THIS SOFTWARE. IF ANY PROBLEMS OR ERRORS ARE ENCOUNTERED, PLEASE
DO NOT ATTEMPT TO FIX THEM SILENTLY OR OUTSIDE THE PROJECT. INSTEAD,
SUBMIT A PULL REQUEST OR OPEN AN ISSUE ON THE CORRESPONDING GITHUB
REPOSITORY SO THAT IT CAN BE ADDRESSED APPROPRIATELY BY THE MAINTAINERS
OR CONTRIBUTORS.
```

---

END OF DOCUMENT

---
