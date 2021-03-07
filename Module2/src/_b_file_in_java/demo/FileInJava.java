package _b_file_in_java.demo;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileInJava {
    public static void main(String[] args) throws IOException {
        String fileName = "src/_b_file_in_java/demo/demo.txt";

        try {
           FileWriter fileWriter = new FileWriter(new File(fileName),true);
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           bufferedWriter.write("Xin chao ban !");
           bufferedWriter.close();
           fileWriter.close();
        }catch (IOException e){
            Logger.getLogger(FileInJava.class.getName()).log(Level.SEVERE, (String) null);
        }
        try {
            FileReader filterReader = new FileReader(new File(fileName));
            BufferedReader bufferedReader = new BufferedReader(filterReader);
            String targer = "";
            targer = bufferedReader.readLine();
            System.out.println(targer);
        } catch (FileNotFoundException e) {
            Logger.getLogger(FileInJava.class.getName()).log(Level.SEVERE, (String) null);
        }catch (IOException e){
            Logger.getLogger(FileInJava.class.getName()).log(Level.SEVERE, (String) null);
        }

    }
}
