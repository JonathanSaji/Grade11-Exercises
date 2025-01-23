package Unit5.Exercises;

import java.io.*;
import java.util.Arrays;

public class Exercise55 {
    public static int lines = 1;
    public static int index = 0;
    public static String[] array = new String[5];
    public static void main(String[] args) {
       // Write the code to read the first line of the text file and print it to the console.
        File file = new File("src/Unit5/Exercises/Exercise55.txt");
        FileRead(file);
        System.out.println(lines);
        System.out.println(Arrays.toString(array));
        System.out.println();
        StringAdder();

    }

    public static void FileRead(File file){
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String temp = br.readLine();
            String sent = "";
            if(temp != null){
                System.out.println(temp);
                while(temp != null){
                    array[index] = temp;

                    temp = br.readLine();
                    if(temp != null){
                        lines++;
                        index++;
                        System.out.println(temp);
                    }
                }
                System.out.println(sent);

            }
            else{
                System.out.println("Nothing Written In txt File");
            }
            br.close();
        }catch(IOException e){
            System.err.println("Error");
        }
    }

    public static void FileWrite(File file, String txt){
        try{
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(txt);
            pw.close();
        }catch(IOException e){
            System.err.println("error");
        }
    }

    public static String WriteBackwards(String txt){
        String reversed = "";
        for(int i = txt.length() -1; i >=0; i--){
            reversed += txt.charAt(i);
        }
        return reversed;
    }
    public static void CreateNewFileAndWrite(String txt){
        try{
            FileWriter fw = new FileWriter("SeashellsReversed.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.println(txt);
            pw.close();
        }catch(IOException e){
            System.err.println("error");
        }
    }
    public static void StringAdder(){
        String FullString = "";
        for(int i = 0; i <= array.length - 1; i++){
            if(array[i] != null) {
                FullString += array[i] + "\n";
            }
        }
        CreateNewFileAndWrite(WriteBackwards(FullString));
    }
}
