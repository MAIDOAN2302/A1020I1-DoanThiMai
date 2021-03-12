package _16_io_file.bai_tap.readFile;

import java.io.*;

public class ReadFile {
    public void readFile() {
        try {
            File file = new File("src/_16_io_file/bai_tap/readFile/cac_quoc_gia.csv");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            String[] lineReadeArray;
            while ((line = bufferedReader.readLine()) != null) {
                lineReadeArray = line.split(",");
                System.out.println(lineReadeArray[5]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ReadFile readFile1 = new ReadFile();
        readFile1.readFile();
    }
}
