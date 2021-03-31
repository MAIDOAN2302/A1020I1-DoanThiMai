package furama.manager;

import furama.controllers.ReadWriteFile;
import furama.models.Customer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CustomerManager {
    Customer customer = new Customer();
    public void addKhachHang(){
        List<Customer> listKhachHang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String hotenKhachHang;
        do {
            System.out.println("Nhap ten khach hang : ");
            hotenKhachHang = scanner.nextLine();
            if (hotenKhachHang.matches("^SV(VL|HO|RO)[-]\\d{4,}$")){
                break;
            }else {
                System.out.println("Nhap sai, xin moi nhap lai!");
            }
        }while (true);

        String ngaySinh;
        do {
            System.out.println("Nhap ngay sinh : ");
            ngaySinh = scanner.nextLine();
            Date now = new Date();
            if (ngaySinh.matches("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")){
                String year = ngaySinh.substring(ngaySinh.lastIndexOf("/")+1);
                int yearOfBirth = Integer.parseInt(year);
                if (yearOfBirth > 1900 && ((now.getYear() + 1900)-yearOfBirth) > 18 ){
                    break;
                }
            }else {
                System.out.println("Nhap sai, xin moi nhap lai!");
            }
        }while (true);

        String gioiTinh;
        do {
            System.out.println("Nhap gioi tinh: ");
             gioiTinh = scanner.nextLine();
             if (gioiTinh.matches("(Mal|Female|Unknow)")){
                 break;
             }else {
                 System.out.println("Nhap sai, xin moi nhap lai");
             }
        }while (true);
        String cmnd;
        do {
            System.out.println("Nhap so CMND: ");
           cmnd = scanner.nextLine();
            if (cmnd.matches("\\d{9,}")){
                customer.setCmnd(Integer.parseInt(cmnd));
                break;
            }else {
                System.out.println("Nhap sai, xin moi nhap lai: ");
            }

        }while (true);

        System.out.println("Nhap so dien thoai: ");
        int sdt = Integer.parseInt(scanner.nextLine());

        String email;
        do {
            System.out.println("Nhap email: ");
            email = scanner.nextLine();
            if (email.matches("^[\\w]*@[\\w]*.[\\w]*$")){
                break;
            }
        }while (true);

        System.out.println("Nhap loai khach hang: ");
        String loaiKhachHang = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String diaChi = scanner.nextLine();

       // Customer customer = new Customer(hotenKhachHang,ngaySinh,gioiTinh,cmnd,sdt,email,loaiKhachHang, diaChi);
        listKhachHang.add(customer);
        ReadWriteFile.writeFileCustomer(customer,true);

    }
    public void showInformationCustomers() {
        List<Customer> list = ReadWriteFile.readFileCustomer();
        for (int i=0; i<list.size(); i++) {
            System.out.println("Hien thi thong tin khach hang" + "\t" + "Khach hang thu " + (1+i)+ ": \t"+ list.get(i));
        }
    }
}
