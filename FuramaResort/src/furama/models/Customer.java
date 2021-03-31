package furama.models;

public class Customer {
    String hoTenKhach;
    String ngaySinh;
    String gioiTinh;
    int cmnd;
    int dienThoai;
    String email;
    String loaiKhach;
    String diaChi;
    Services dichVuSuDung;

    public Customer() {
    }

    public Customer(String hoTenKhach, String ngaySinh, String gioiTinh,
                    int cmnd, int dienThoai, String email, String loaiKhach,
                    String diaChi) {
        this.hoTenKhach = hoTenKhach;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.dienThoai = dienThoai;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;

    }

    public String showInforCustomer(){
        return "Thong tin khach : " + "\t"
                +  "Ten khach : " + hoTenKhach + "\t"
                +  "Ngay sinh : " + ngaySinh + "\t"
                +  "Gioi tinh  : " + gioiTinh + "\t"
                +  "So CMND : " + cmnd + "\t"
                +  "SDT : " + dienThoai + "\t"
                +  "Email : " + email + "\t"
                +  "Loai khach hang : " + loaiKhach + "\t"
                +  "Dia chi : " + diaChi + "\t"
                +  "Dich vu khach hang su dung : " + dichVuSuDung;

    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }
}
