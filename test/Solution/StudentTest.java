package Solution;

// StudentTest.java
//
// This file contains unit tests for the Student class methods.
// The StudentTest class uses the JUnit 4 framework to verify the correctness of methods
// in the Student class. It includes tests for saving, searching, and deleting student
// records, as well as validating student age. The tests ensure that the Student class
// behaves as expected under various scenarios.

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest 
{
    /**
     * Tests the SaveStudent method to ensure that a student can be successfully
     * added to the list and retrieved.
     * 
     * This test creates a new Student object, saves it using SaveStudent, and
     * then verifies that the student can be retrieved using SearchStudent.
     * It asserts that the student is not null and that the name of the retrieved
     * student matches the expected name.
     */
    @Test
    public void TestSaveStudent() 
    {
        Student student = new Student("10111", "J.Bloggs", 19, "jbloggs@ymail.com", "disd");
        Student.SaveStudent(student); // Save the student to the list
        Student result = Student.SearchStudent("10111"); // Retrieve the student by ID
        assertNotNull(result); // Check that the result is not null
        assertEquals("J.Bloggs", result.getName()); // Verify the student's name
    }

    /**
     * Tests the SearchStudent method to ensure that a student can be found
     * by their unique ID.
     * 
     * This test creates a new Student object, saves it, and then searches for
     * the student by their ID. It verifies that the student is found and that
     * the name of the student matches the expected name.
     */
    @Test
    public void TestSearchStudent() 
    {
        Student student = new Student("10112", "J.Doe", 21, "jdoe@ymail.com", "disd");
        Student.SaveStudent(student); // Save the student to the list
        Student result = Student.SearchStudent("10112"); // Search for the student by ID
        assertNotNull(result); // Check that the result is not null
        assertEquals("J.Doe", result.getName()); // Verify the student's name
    }

    /**
     * Tests the SearchStudent method to ensure that a search for a non-existent
     * student returns null.
     * 
     * This test searches for a student with an ID that does not exist in the list.
     * It asserts that the result is null, indicating that the student was not found.
     */
    @Test
    public void TestSearchStudent_StudentNotFound() 
    {
        Student result = Student.SearchStudent("99999"); // Search for a non-existent student
        assertNull(result); // Check that the result is null
    }

    /**
     * Tests the DeleteStudent method to ensure that a student can be successfully
     * removed from the list by their ID.
     * 
     * This test creates a new Student object, saves it, and then deletes the student
     * by their ID. It verifies that the deletion was successful and that the student
     * can no longer be found in the list.
     */
    @Test
    public void TestDeleteStudent() 
    {
        Student student = new Student("10113", "P.Parker", 20, "spidey@ymail.com", "disn");
        Student.SaveStudent(student); // Save the student to the list
        boolean deleted = Student.DeleteStudent("10113"); // Delete the student by ID
        assertTrue(deleted); // Check that the deletion was successful
        assertNull(Student.SearchStudent("10113")); // Verify that the student is no longer in the list
    }

    /**
     * Tests the DeleteStudent method to ensure that attempting to delete a non-existent
     * student returns false.
     * 
     * This test tries to delete a student with an ID that does not exist in the list.
     * It asserts that the deletion was not successful.
     */
    @Test
    public void TestDeleteStudent_StudentNotFound() 
    {
        boolean deleted = Student.DeleteStudent("55555"); // Attempt to delete a non-existent student
        assertFalse(deleted); // Check that the deletion was not successful
    }

    /**
     * Tests the validity of a student age by checking if a valid age is correctly identified.
     * 
     * This test verifies that an age of "18" is considered valid by the isValidAge method.
     */
    @Test
    public void TestStudentAge_StudentAgeValid() 
    {
        assertTrue(isValidAge("18")); // Check that the age "18" is valid
    }

    /**
     * Tests the validity of a student age by checking if an invalid age is correctly identified.
     * 
     * This test verifies that an age of "10" is considered invalid by the isValidAge method.
     */
    @Test
    public void TestStudentAge_StudentAgeInvalid() 
    {
        assertFalse(isValidAge("10")); // Check that the age "10" is invalid
    }

    /**
     * Tests the validity of a student age by checking if an invalid input causes a NumberFormatException.
     * 
     * This test verifies that an invalid age input such as "c" results in a NumberFormatException
     * being thrown when parsed as an integer.
     */
    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter() 
    {
        try 
        {
            Integer.parseInt("c"); // Attempt to parse an invalid age input
            fail("Expected NumberFormatException not thrown"); // Fail the test if exception is not thrown
        } 
        catch (NumberFormatException e) 
        {
            // Expected exception, test passes
        }
    }

    /**
     * Helper method to validate if the provided age input is a valid age (16 or older).
     * 
     * @param ageInput The age input as a string.
     * @return True if the age is valid, false otherwise.
     */
    private boolean isValidAge(String ageInput) 
    {
        try 
        {
            int age = Integer.parseInt(ageInput); // Parse the age input
            return age >= 16; // Return true if the age is 16 or older
        } 
        catch (NumberFormatException e) 
        {
            return false; // Return false if the input is not a valid integer
        }
    }
}