package _16_io_file.bai_tap.copyFile;

import java.io.*;
import java.util.Arrays;

public class CopyFile {
    public static void main(String[] args) {
        copyFile1();
        printFile();
    }

    public static void copyFile1() {
        FileReader fileReader1 = null;
        BufferedReader bufferedReader1 = null;
        FileWriter fileWriter2 = null;
        BufferedWriter bufferedWriter2 = null;
        try {
            File file1 = new File("src/_16_io_file/bai_tap/copyfile/file1.csv");
            fileReader1 = new FileReader(file1);
            bufferedReader1 = new BufferedReader(fileReader1);

            File file2 = new File("src/_16_io_file/bai_tap/copyfile/file2.csv");
            fileWriter2 = new FileWriter(file2);
            bufferedWriter2 = new BufferedWriter(fileWriter2);
            if (file1.exists()) {
                String line = null;
                while ((line = bufferedReader1.readLine()) != null) {
                    bufferedWriter2.write(line);
                    bufferedWriter2.newLine();
                }
            } else {
                System.out.println("File khong ton tai!");
            }
        } catch (IOException e) {
            System.out.println("File khong ton tai hoac loi");
        } finally {
            try {
                bufferedWriter2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void printFile() {
        File file = new File("src/_16_io_file/bai_tap/copyfile/file2.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader buff = new BufferedReader(fileReader);

            String line = null;
            while ((line = buff.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}