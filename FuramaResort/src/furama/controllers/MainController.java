package furama.controllers;

import furama.manager.CustomerManager;
import furama.manager.ManagerService;

import java.util.Scanner;

public class MainController {
    ManagerService managerService = new ManagerService();
    CustomerManager customerManager = new CustomerManager();

    public void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println(
                    "1. Add new Services: " +
                            "\n2. Show Services: " +
                            "\n3. Add New Customer: " +
                            "\n4. Show Information of Customer: " +
                            "\n5. Add New Booking: " +
                            "\n6. Show Information of Employee: " +
                            "\n7. Exit");
            System.out.println("Enter your choose: ");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    managerService.addNewServies();
                case 2:
                    managerService.showServices();
                case 3:
                    customerManager.addKhachHang();
                case 4:
                    customerManager.showInformationCustomers();
                case 5:
                case 6:
                default:
                    displayMainMenu();
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainController mainController = new MainController();
        mainController.displayMainMenu();
    }
}

