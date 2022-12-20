package myapp.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// java IOMain <src><dest>
// java IOMain myfile myfile.dup

// To run this file use
// java myapp.core.IOMain exams.csv exams_dst.csv
// Purpose of this program is to transfer contents from one file to the another
// In this case I read exams.csv file and I transfer everyline to exams_dst.file

public class IOMain {

    public static void main(String[] args) {

        // Where I read it from 
        String srcFile = args[0];

        // Where I write it to
        String dstFile = args[1];

        // 1k byte buffer
        // buffer is how big do u want to read at a time, the bigger the buffer the faster it reads
        byte[] buff = new byte[1024];
        int size = 0;

        try {
            // A FileInputStream obtains input bytes from a file in a file system
            InputStream is = new FileInputStream(srcFile);
            System.out.printf("%s file opened", srcFile);

            // A file output stream is an output stream for writing data to a File or to a FileDescriptor
            OutputStream os = new FileOutputStream(dstFile);

            while (size >= 0) {
                size = is.read(buff);
                System.out.printf("read: %d\n", size);

                // If there are something for me to read?
                if (size > 0) {

                    // See documentation 
                    // b = the data
                    // off = the start offset in the data
                    // len = the number of bytes to write.
                    // write(byte[] b, int off, int len)
                    os.write(buff, 0, size);
                }
            }

            // This might give an IO exception hence we must put catch for the IOException to remove the error
            is.close();

            os.flush();
            os.close();

        } catch (FileNotFoundException ex) {
            System.err.printf("Error: %s\n", ex.getMessage());

        } catch (IOException ex) {
            System.err.printf("Error: %s\n", ex.getMessage());
        }
        
    }
    
}
