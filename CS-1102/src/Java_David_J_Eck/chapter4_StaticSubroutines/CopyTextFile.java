package Java_David_J_Eck.chapter4_StaticSubroutines;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Requires two command line arguments, which must be file names. The
 * first must be the name of an existing file. The second is the name
 * of a file to be created by the program. The contents of the first file
 * are copied into the second. WARNING: If the second file already
 * exists when the program is run, its previous contents will be lost!
 * This program only works for plain text files.
 */

public class CopyTextFile {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Two command-line arguments are required!");
            System.exit(1);
        }

        Scanner scanner = null;
        FileWriter writer = null;

        try {
            scanner = new Scanner(new File(args[0]));   // Open the original
            // file for reading.
            writer = new FileWriter(new File(args[1])); // Open the copy file
            // for writing.

            int lineCount = 0;  // Number of lines copied.
            while (scanner.hasNextLine()) {
                // Read a line from the original file and write it to the copy.
                String line = scanner.nextLine();
                writer.write(line + "\n");
                lineCount++;
            }

            System.out.printf("%d lines copied from %s to %s%n", lineCount,
                    args[0], args[1]);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the " +
                            "writer: " + e.getMessage());
                }
            }
        }
    }   // end main()
}   // end class
