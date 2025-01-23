package Unit5.TextFile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

    public static void main(String[] args) {
        File file = new File("src/Unit5/TextFile/TextFile.txt");
        try{
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Hello \nStranger");
            pw.close();
        } catch (IOException e) {
            System.err.println("Error");
        }
    }


}

