package ex_30_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab226_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        // Throws instead of Try Catch block
        // throws mean publicly allowing method to handle the exception
        FileReader files = new FileReader(new File("C://test.txt"));
    }
}

// by adding parent for common exceptions use-> Exception with throws
// it can b attached to any exception
