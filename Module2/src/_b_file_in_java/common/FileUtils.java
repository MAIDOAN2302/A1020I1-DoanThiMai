package _b_file_in_java.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static void writeFile(String pathFile, String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String pathFile){
        //Tao 1 List de hung du lieu
        List<String> listLine = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // tao string de luu tung line tung line ma chung ta di qua
            String line = null;

            // tao vong lap while --> moi lan lap chung ta se di qua tung dong va doc cho den khi nao  no kha null

            while ((line = bufferedReader.readLine()) != null){
                listLine.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
}
