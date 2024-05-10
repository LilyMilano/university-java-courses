package Java_David_J_Eck.chapter2.Exercises;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentGradesEx7 {

    /**
     * 7 Write a file named “testdata.txt” that contains the following
     * information: The first line of the file is the name of a student. Each
     * of the next three lines contains an integer.
     * The integers are the student’s scores on three exams.
     * Write a program that will read the information in the file and display
     * (on standard output) a message that contains the name of the student and
     * the student’s average grade on the three exams. The average is obtained
     * by adding up the individual exam grades and then dividing by the
     * number of
     * exams.
     */

    public static void main(String[] args) {
        // Create the testdata.txt file with the required information
        createTestDataFile();

        // Specify the file path
        String filePath = "testdata.txt";

        // Read the file and calculate the average grade
        try (Scanner scanner = new Scanner(new File(filePath))) {
            // Read the name of the student from the first line
            String studentName = scanner.nextLine();

            // Read the exam scores
            int score1 = scanner.nextInt();
            int score2 = scanner.nextInt();
            int score3 = scanner.nextInt();

            // Calculate the average grade
            double averageGrade = (score1 + score2 + score3) / 3.0;

            // Display the results
            System.out.println("Student name: " + studentName);
            System.out.println("Average grade: " + averageGrade);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        /* Output:
        * File created successfully: testdata.txt
        * Student name: Susana White
        * Average grade: 88.0
        *
        * Process finished with exit code 0
        */

    }   // ends main()

    public static void createTestDataFile() {
        // Specify the file path
        String filePath = "testdata.txt";

        // Write the data to the file
        try (FileWriter writer = new FileWriter(filePath)) {
            // Write the student's name to the file
            writer.write("Susana White\n");

            // Write the exam scores to the file
            writer.write("85\n");
            writer.write("92\n");
            writer.write("87\n");

            System.out.println("File created successfully: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }

    }   // ends createTestDataFile sub-routine
}   // ends class
