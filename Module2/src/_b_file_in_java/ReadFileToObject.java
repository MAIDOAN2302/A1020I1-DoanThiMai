package _b_file_in_java;

import java.io.*;

public class ReadFileToObject {
    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.setTen("Nguyen Van A");
        sinhVien.setTuoi(25);
        sinhVien.setDiem(10);
        String filename = "Demo1.txt";
        // muon ghi file phai tao ra 1 then FileOutputStream
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(sinhVien);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // doc file thi tao ra mot FileInputStream

        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            SinhVien sinhVien1 = new SinhVien();
            sinhVien1 =(SinhVien) objectInputStream.readObject();
            System.out.println("Ten cua sinh vien la : " + sinhVien1.getTen());
            System.out.println("Tuoi cua sinh vien la : " + sinhVien1.getTuoi());
            System.out.println("Diem cua sinh vien la : " + sinhVien1.getDiem());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
class SinhVien implements Serializable{
    private String ten;
    private int tuoi;
    private int diem;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
}
