package furama.manager;

import furama.controllers.ReadWriteFile;
import furama.models.House;
import furama.models.Room;
import furama.models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerService {
    public void addNewServies() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "1. Add New Villa: " +
                        "\n2. Add New House: " +
                        "\n3. Add New Room: " +
                        "\n4. Back to menu: " +
                        "\n5. Exit");
        System.out.println("Enter your choose: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                addVilla();
                break;
            case 2:
                addHouse();
                break;
            case 3:
                addRoom();
                break;
            case 4:
                addNewServies();
            case 5:
                System.exit(5);
        }
    }

    public void addVilla() {
        List<Villa> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tNhap id : ");
        String id = scanner.nextLine();

        String servicesName;
        do {
            System.out.print("\tNhap ten dich vu : ");
            servicesName = scanner.nextLine();
            if (servicesName.matches("^[A-Z][\\w\\s-]*$")){
                break;
            }else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        double useArea;
        do {
            System.out.print("\tNhap dien tich su dung : ");
            useArea = Double.parseDouble(scanner.nextLine());
            if (useArea > 30) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        double rentCost;
        do {
            System.out.print("\tNhap phi thue : ");
            rentCost = Double.parseDouble(scanner.nextLine());
            if (rentCost > 0) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);
        int amountOfPeopleMax;
        do {
            System.out.print("\tNhap so nguoi toi da : ");
            amountOfPeopleMax = Integer.parseInt(scanner.nextLine());
            if (amountOfPeopleMax > 0 && amountOfPeopleMax < 20) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        System.out.print("\tNhap kieu thue : ");
        String rentStyle = scanner.nextLine();

        String standerRoom;
        do {
            System.out.print("\tNhap tieu chuan phong : ");
            standerRoom = scanner.nextLine();
            if (standerRoom == servicesName){
                break;
            }else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        }while (true);


        double poorArea;
        do {
            System.out.print("\tNhap dien tich ho boi : ");
            poorArea = Double.parseDouble(scanner.nextLine());
            if (poorArea > 30) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        int numberFloor;
        do {
            System.out.print("\tNhap so tang : ");
            numberFloor = Integer.parseInt(scanner.nextLine());
            if (numberFloor > 0) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        String otherServices;
        do {
            System.out.print("\tNhap dich vu khac : ");
            otherServices = scanner.nextLine();
            if (otherServices.matches("(massage|karaoke|food|drink|car)")){
                break;
            }else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        }while (true);

        Villa villa = new Villa(id, servicesName, useArea, rentCost, amountOfPeopleMax, rentStyle,
                standerRoom, poorArea, numberFloor, otherServices);
        list.add(villa);
        ReadWriteFile.writeFileVilla(villa, true);

    }

    public void addHouse() {
        List<House> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\tNhap id : ");
        String id = scanner.nextLine();

        String servicesName;
        do {
            System.out.print("\tNhap ten dich vu : ");
            servicesName = scanner.nextLine();
            if (servicesName.matches("^^[A-Z][\\w\\s-]*$")){
                break;
            }else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        double useArea;
        do {
            System.out.print("\tNhap dien tich su dung : ");
            useArea = Double.parseDouble(scanner.nextLine());
            if (useArea > 30) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        double rentCost;
        do {
            System.out.print("\tNhap phi thue : ");
            rentCost = Double.parseDouble(scanner.nextLine());
            if (rentCost > 0) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        int amountOfPeopleMax;
        do {
            System.out.print("\tNhap so nguoi toi da : ");
            amountOfPeopleMax = Integer.parseInt(scanner.nextLine());
            if (amountOfPeopleMax > 0 && amountOfPeopleMax < 20) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        System.out.print("\tNhap kieu thue : ");
        String rentStyle = scanner.nextLine();

        String standerRoom;
        do {
            System.out.print("\tNhap tieu chuan phong : ");
            standerRoom = scanner.nextLine();
            if (standerRoom == servicesName){
                break;
            }else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        }while (true);

        int numberFloor;
        do {
            System.out.print("\tNhap so tang : ");
            numberFloor = Integer.parseInt(scanner.nextLine());
            if (numberFloor > 0) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        String otherServices;
        do {
            System.out.print("\tNhap dich vu khac : ");
            otherServices = scanner.nextLine();
            if (otherServices.matches("(massage|karaoke|food|drink|car)")){
                break;
            }else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        }while (true);

        House house = new House(id, servicesName, useArea, rentCost, amountOfPeopleMax,
                rentStyle, standerRoom, otherServices, numberFloor);
        list.add(house);
        ReadWriteFile.writeFileHouse(house, true);

    }

    public void addRoom() {
        List<Room> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\tNhap id : ");
        String id = scanner.nextLine();

        String servicesName;
        do {
            System.out.print("\tNhap ten dich vu : ");
            servicesName = scanner.nextLine();
            if (servicesName.matches("^^[A-Z][\\w\\s-]*$")){
                break;
            }else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        double useArea;
        do {
            System.out.print("\tNhap dien tich su dung : ");
            useArea = Double.parseDouble(scanner.nextLine());
            if (useArea > 30) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);

        double rentCost;
        do {
            System.out.print("\tNhap phi thue : ");
            rentCost = Double.parseDouble(scanner.nextLine());
            if (rentCost > 0) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);
        int amountOfPeopleMax;
        do {
            System.out.print("\tNhap so nguoi toi da : ");
            amountOfPeopleMax = Integer.parseInt(scanner.nextLine());
            if (amountOfPeopleMax > 0 && amountOfPeopleMax < 20) {
                break;
            } else {
                System.out.println("Nhap sai! xin moi nhap lai: ");
            }
        } while (true);


        System.out.print("\tNhap kieu thue : ");
        String rentStyle = scanner.nextLine();

        System.out.print("\tNhap dich vu mien phi : ");
        String freeServices = scanner.nextLine();

        Room room = new Room(id, servicesName, useArea, rentCost, amountOfPeopleMax,
                rentStyle, freeServices);
        list.add(room);
        ReadWriteFile.writeFileRoom(room, true);

    }

    public void showServices() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "1. Show all Villa: " +
                        "\n2. Show all House: " +
                        "\n3. Show all Room: " +
                        "\n4. Show All Name Villa Not Duplicate: " +
                        "\n5. Show All Name House Not Duplicate: " +
                        "\n6. Show All Name Name Not Duplicate: " +
                        "\n7. Back to menu: " +
                        "\n8. Exit. "
        );
        System.out.println("Enter your choose: ");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
            case 2:
            case 3:
                showServiceChoose(choose);
                break;
            case 4:

            case 5:

            case 6:
            case 7:
            case 8:
            default:
        }
    }

    public void showServiceChoose(int choose) {

        switch (choose) {
            case 1:
                List<Villa> villaList = ReadWriteFile.readFileVilla();
                for (int i = 0; i < villaList.size(); i++) {
                    System.out.println("Danh sach thu " + (i + 1) + "la: " + villaList.get(i));
                }
                break;
            case 2:
                List<House> houseList = ReadWriteFile.readFileHouse();
                for (int i = 0; i < houseList.size(); i++) {
                    System.out.println("Danh sach thu " + (i + 1) + "la: " + houseList.get(i));
                }
                break;
            case 3:
                List<Room> roomList = ReadWriteFile.readFileRoom();
                for (int i = 0; i < roomList.size(); i++) {
                    System.out.println("Danh sach thu " + (i + 1) + "la: " + roomList.get(i));
                }
                break;
            default:
                System.out.println("Lua chon cua ban khong co !");
        }
    }


}
