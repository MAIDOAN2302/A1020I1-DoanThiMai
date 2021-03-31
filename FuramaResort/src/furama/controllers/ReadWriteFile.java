package furama.controllers;


import furama.models.Customer;
import furama.models.House;
import furama.models.Room;
import furama.models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static List<Villa> readFileVilla(){
        List<Villa> list = new ArrayList<>();

        File file = new File("src/furama.data/Villa.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Loi khong tim thay file!");
        } catch (IOException e) {
            System.err.println("Loi dau vao !");
        }
        return list;
    }

    public static void writeFileVilla(Villa villa , boolean append){
        File file = new File("src/furama.data/Villa.csv");
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(villa.getInfo());
            System.out.println(villa.getInfo());
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Loi dau vao!");
        }
    }

    public static List<House> readFileHouse(){
        List<House> list = new ArrayList<>();

        File file = new File("src/furama.data/House.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Loi khong tim thay file!");
        } catch (IOException e) {
            System.err.println("Loi dau vao !");
        }
        return list;
    }

    public static void writeFileHouse(House house , boolean append){
        File file = new File("src/furama.data/House.csv");
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(house.getInforHouse());
            System.out.println(house.getInforHouse());
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Loi dau vao!");
        }
    }

    public static List<Room> readFileRoom(){
        List<Room> list = new ArrayList<>();
        File file = new File("src/furama.data/Room.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Loi khong tim thay file!");
        } catch (IOException e) {
            System.err.println("Loi dau vao !");
        }
        return list;
    }

    public static void writeFileRoom(Room room , boolean append){
        File file = new File("src/furama.data/Room.csv");
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(room.getInforRoom());
            System.out.println(room.getInforRoom());
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Loi dau vao!");
        }
    }

    public static List<Customer> readFileCustomer(){
        List<Customer> list = new ArrayList<>();
        File file = new File("src/furama.data/Customer.csv");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Loi khong tim thay file!");
        } catch (IOException e) {
            System.err.println("Loi dau vao !");
        }
        return list;
    }

    public static void writeFileCustomer(Customer customer , boolean append){
        File file = new File("src/furama.data/Customer.csv");
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write(customer.showInforCustomer());
            System.out.println(customer.showInforCustomer());
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println("Loi dau vao!");
        }
    }

}
