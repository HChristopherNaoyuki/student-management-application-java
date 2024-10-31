---

# Student Management Application

## Overview

The Student Management Application is a console-based program designed to manage student records efficiently. It allows users to capture new student details, search for students by ID, delete student records, and generate reports of all student records. The application provides a simple menu-driven interface for ease of use.

## Features

- **Capture Student Details**: Add new student records with unique IDs, names, ages, emails, and courses.
- **Search for Students**: Retrieve student information using their unique IDs.
- **Delete Student Records**: Remove student records after confirming the deletion.
- **Generate Reports**: Print a report listing all students with their details.
- **Age Validation**: Ensure that the entered age meets the required minimum (16 years).

## Requirements

- Java Development Kit (JDK) 8 or higher
- JUnit 4 for testing

## Structure

The application consists of three main classes:

1. **Student**: Represents a student record and provides methods for saving, searching, deleting, and reporting on student records.
2. **StudentManagementApplication**: Contains the main method and handles user interactions via a console interface.
3. **StudentTest**: Contains unit tests for the `Student` class, ensuring that all methods work correctly.

## Getting Started

### Installation

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/student-management-application-java.git
   ```

2. Navigate to the project directory:
   ```bash
   cd <project-directory>
   ```

3. Compile the Java files:
   ```bash
   javac QUESTION1/*.java
   ```

### Running the Application

To run the application, execute the following command in the terminal:

```bash
java QUESTION1.StudentManagementApplication
```

Follow the on-screen prompts to interact with the application.

### Running Tests

To run the unit tests, ensure you have JUnit 4 in your classpath, and then execute:

```bash
java -cp .:junit-4.x.x.jar:hamcrest-core-1.x.jar org.junit.runner.JUnitCore QUESTION1.StudentTest
```

Replace `4.x.x` and `1.x` with the appropriate version numbers.

## Example Usage

- **Capture a New Student**: Select option (1) and enter the student details.
- **Search for a Student**: Select option (2) and provide the student ID.
- **Delete a Student**: Select option (3) and confirm the deletion.
- **Print Student Report**: Select option (4) to view all student records.

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests for improvements or bug fixes.

---
