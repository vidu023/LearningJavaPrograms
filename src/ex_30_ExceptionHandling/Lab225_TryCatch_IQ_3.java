package ex_30_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public record Lab225_TryCatch_IQ_3() {
    public static void main(String[] args) {
        // this is a Checked Exception
        try {
            FileReader f = new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
Output:
C:\abc.txt (The system cannot find the file specified)
*/
