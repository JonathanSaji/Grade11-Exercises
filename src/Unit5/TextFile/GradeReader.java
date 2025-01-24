package Unit5.TextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class GradeReader {
    public static void main(String[] args) {
        File file = new File("src/Unit5/TextFile/Grades.txt");
        int[] int_array = new int[10];
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String grade_line = br.readLine();
            int num = 0;
            while(grade_line != null) {
                String grade = grade_line.substring(grade_line.length()-3);
                int gradeInt = Integer.parseInt(grade);
                int_array[num] = gradeInt;
                grade_line = br.readLine();
                num++;
            }
            System.out.println(Arrays.toString(int_array));
        }catch(IOException e){
            System.err.println(e +" Error");
        }

    }
}
