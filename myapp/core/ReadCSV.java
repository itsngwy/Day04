package myapp.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileReader;

// This is my own try on reading the exam.csv file
// This is my own try on reading the exam.csv file
// This is my own try on reading the exam.csv file

public class ReadCSV {

    public static void main(String[] args) {

        // Path = "/Users/yangteng/vttp2022/day04/exams.csv";
        String srcFile = args[0];
        String line = "";
        
        int groupAMath = 0;
        int groupAMEnglish = 0;
        int groupAWriting = 0;
        int numberOfGroupA = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader(srcFile));

            // the line is assigned to br.readLine()
            while((line = br.readLine()) != null) {

                String[] values = line.split(",");
                

                for (int i = 0; i < values.length; i++) {
                    values[i] = values[i].replaceAll("\"", "");
                }

                switch (values[1]) {
                    case "group A": 
                    numberOfGroupA++;
                    groupAMath += Integer.parseInt(values[5]);
                    groupAMEnglish += Integer.parseInt(values[6]);
                    groupAWriting += Integer.parseInt(values[7]);
                    break;

                    case "group B":
                    
                }
                
            }
            System.out.printf("Total number of Group A: %d\n", numberOfGroupA);
            System.out.printf("Total Math Score: %d and the Average Score: %d\n",groupAMath, groupAMath/numberOfGroupA);
            System.out.printf("Total Reading Score: %d and the Average Score: %d\n", groupAMEnglish, groupAMEnglish/numberOfGroupA);
            System.out.printf("Total Writing Score: %d and the Average Score: %d\n", groupAWriting, groupAWriting/numberOfGroupA);

            br.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
   
    
}
