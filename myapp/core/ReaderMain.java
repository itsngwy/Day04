package myapp.core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderMain {

    // java ReaderMain text_file
    // java myapp.core.ReaderMain exams.csv to run
    public static void main(String[] args) 
            throws FileNotFoundException, IOException {

        String srcFile = args[0];
        
        // FileReader is meant for reading streams of characters. 
        Reader reader = new FileReader(srcFile);
        BufferedReader br = new BufferedReader(reader);

        String line = "";
        int lineNum = 0;

        while (line != null) {
            line = br.readLine();
            lineNum++;
            System.out.printf("%d: %s\n", lineNum, line.toUpperCase());
        }

        reader.close();
    }
    
}
