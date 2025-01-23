package Unit5.TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Reader {
    public static void main(String[] args) {
        File file = new File("src/Unit5/TextFile/TextFile.txt");
        String[] array = new String[5];
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String temp = "idk";
            if(temp != null){
                int lines = 0;
                int index = 0;
                while(temp != null){
                    temp = br.readLine();
                    lines++;
                    if(temp != null){
                        array[index] = temp;
                        System.out.println(temp);
                        index++;
                    }
                }
                System.out.println(lines);
                System.out.println(Arrays.toString(array));
            }
            else{
                System.out.println("Nothing Was Read");
            }
            br.close();
        }catch(IOException e){
            System.err.println("File Not Found");
        }

    }
}
