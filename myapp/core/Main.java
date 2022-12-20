package myapp.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// Main and ExamReporter

public class Main {

    public static void main(String[] args) 
            throws IOException {

        String dataFile = args[0];

        ExamReporter reporter = new ExamReporter();
        
        // Read the exams.csv file
        Reader r = new FileReader(dataFile);
        // Read it efficiently
        BufferedReader br = new BufferedReader(r);

        // Remove the first line
        String data = br.readLine();

        while (null != data) {
            // BufferedReader will not read the first line again
            data = br.readLine();
            reporter.read(data);
        }

        reporter.generateReport();
    }
}