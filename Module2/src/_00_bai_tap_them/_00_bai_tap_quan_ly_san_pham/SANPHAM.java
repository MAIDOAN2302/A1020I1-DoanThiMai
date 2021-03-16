package _00_bai_tap_them._00_bai_tap_quan_ly_san_pham;

public abstract class SANPHAM {
    String msp;
    String tesp;
    float soluong;
    float dongia;
    abstract float tinhtien();

    public SANPHAM(String msp, String tesp, float soluong, float dongia) {
        this.msp = msp;
        this.tesp = tesp;
        this.soluong = soluong;
        this.dongia = dongia;
    }

    public String getMsp() {
        return msp;
    }

    public void setMsp(String msp) {
        this.msp = msp;
    }

    public String getTesp() {
        return tesp;
    }

    public void setTesp(String tesp) {
        this.tesp = tesp;
    }

    public float getSoluong() {
        return soluong;
    }

    public void setSoluong(float soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }
}
