package _11_stack_queue.bai_tap.demerging;

import java.util.*;

public class PersonManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter information: ");
//
//        String name = scanner.nextLine();
//        String gender = scanner.nextLine();
//        String birthday = scanner.nextLine();


        List<Person> personList = new ArrayList<>();
        System.out.println("So luong person" );
        int num = Integer.parseInt(scanner.nextLine());

//        personList.add(new Person("Trung","nu","02/23/1992"));
//        personList.add(new Person("Mi","nu","02/23/1992"));
//        personList.add(new Person("Nam","nam","02/23/1992"));
//        personList.add(new Person("Mai","nu","02/23/1992"));


        for (int i = 0; i < num ; i++){
            System.out.println("Thong tin: ");
            System.out.println("Print Name: ");
            String name = scanner.nextLine();
            System.out.println("Print Gender: ");
            String gender = scanner.nextLine();
            System.out.println("Print Birthday: ");
            String birthday = scanner.nextLine();
            personList.add(new Person(name,gender,birthday));
        }

        Queue<Person> nu = new LinkedList<>();
        Queue<Person> nam = new LinkedList<>();

        for (Person person:personList) {
            if (person.gender.equals("nu")){
                nu.offer(person);
            }else {
                nam.offer(person);
            }
        }
        System.out.println(nu + "\n");
        System.out.println(nam + "\n");

//        Person [] arr = new Person[num];
        ArrayList<Person> arrayList = new ArrayList<>();
        for (int i = 0; i < nu.size()+nam.size(); i++){
           if (!nam.isEmpty()){
               arrayList.add(nam.poll()) ;
//               System.out.println(arrayList);
           }else if (!nu.isEmpty()){
               arrayList.add(nu.poll()) ;
//               System.out.println(arr[i]);
           }
        }
        for (Person person:arrayList) {
            System.out.println(person);

        }



    }
}
