package controllers;

import models.Villa;

import java.io.*;
import java.util.Scanner;

public class ReadWriteFile extends Villa {
    public ReadWriteFile(String id, String servicesName,
                         double useArea, double rentCost,
                         int amountOfPeopleMax, String rentStyle, String standerRoom,
                         double poorArea, int numberFloor, String otherServices) {
        super(id, servicesName, useArea, rentCost, amountOfPeopleMax,
                rentStyle, standerRoom, poorArea, numberFloor, otherServices);
    }

    public static void main(String[] args) throws IOException {
        File fileVilia = new File("src/data/Villa.csv");
        FileWriter fileWriterVilla = new FileWriter(fileVilia);
        BufferedWriter bufferedWriterVilla = new BufferedWriter(fileWriterVilla);

        bufferedWriterVilla.newLine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap cac dich vu cua Villa: ");
        System.out.println("Moi nhap Id :");
        String id = scanner.nextLine();
        bufferedWriterVilla.write(id);
        bufferedWriterVilla.close();

        System.out.println("Moi nhap ten dich vu: ");
        String servicesName = scanner.nextLine();
        bufferedWriterVilla.write(servicesName);
        bufferedWriterVilla.close();

        System.out.println("Moi nhap dien tich su dung:");
        double useArea = scanner.nextDouble();
        bufferedWriterVilla.write((int) useArea);
        bufferedWriterVilla.close();

        System.out.println("Moi nhap chi phi cho thue:");
        double rentCost = scanner.nextDouble();
        bufferedWriterVilla.write((int) rentCost);
        bufferedWriterVilla.close();

        System.out.println("Moi nhap so nguoi su dung toi da:");
        int amountOfPeopleMax = scanner.nextInt();
        bufferedWriterVilla.write(amountOfPeopleMax);
        bufferedWriterVilla.close();

        System.out.println("Moi nhap kieu thue:");
        String rentStyle = scanner.nextLine();
        String rentStyle1 = scanner.nextLine();
        bufferedWriterVilla.write(rentStyle);
        bufferedWriterVilla.close();

        System.out.println("Moi nhap tieu chuan phong:");
        String standerRoom = scanner.nextLine();
        bufferedWriterVilla.write(standerRoom);
        bufferedWriterVilla.close();

        System.out.println("Moi nhap dien tich ho boi: ");
        double poorArea = scanner.nextDouble();
        bufferedWriterVilla.write((int) poorArea);
        bufferedWriterVilla.close();

        System.out.println("Moi nhap so tang:");
        int numberFloor = scanner.nextInt();
        bufferedWriterVilla.write(numberFloor);
        bufferedWriterVilla.close();

        System.out.println("Moi nhap dich vu khac: ");
        String otherServices = scanner.nextLine();
        String otherServices1 = scanner.nextLine();
        bufferedWriterVilla.write(otherServices);
        bufferedWriterVilla.close();
    }
}
