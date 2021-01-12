package _03_Array_in_Java;

import java.util.Scanner;

public class FindOneElementInArray {
    public static void main(String[] args) {
        String[] student = {"An","Hau","Mai","Van","Nhi","Yen","Long","Thu"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's Student: ");
        String input_name = scanner.nextLine();

        boolean isExit = false;
        for (int i = 0; i < student.length; i++){
            if (student[i].equals(input_name)){
                System.out.println("Position of the students in the list " +input_name + "is: " + (i+1));
                isExit = true;
                break;
            }
        }
        if (!isExit){
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
