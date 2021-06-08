package model;

import java.util.Date;

public class MatBang {
    private String maMatBang;
    private double dienTich;
    private String trangThai;
    private int tang;
    private int idLoaiVp;
    private String moTaChiTiet;
    private double giaChoThue;
    private String ngayBatDau;
    private String ngayKetThuc;

    public MatBang() {
    }

    public MatBang(String maMatBang, double dienTich, String trangThai, int tang, int idLoaiVp,
                   String moTaChiTiet, double giaChoThue, String ngayBatDau, String ngayKetThuc) {
        this.maMatBang = maMatBang;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
        this.tang = tang;
        this.idLoaiVp = idLoaiVp;
        this.moTaChiTiet = moTaChiTiet;
        this.giaChoThue = giaChoThue;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaMatBang() {
        return maMatBang;
    }

    public void setMaMatBang(String maMatBang) {
        this.maMatBang = maMatBang;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public int getIdLoaiVp() {
        return idLoaiVp;
    }

    public void setIdLoaiVp(int idLoaiVp) {
        this.idLoaiVp = idLoaiVp;
    }

    public String getMoTaChiTiet() {
        return moTaChiTiet;
    }

    public void setMoTaChiTiet(String moTaChiTiet) {
        this.moTaChiTiet = moTaChiTiet;
    }

    public double getGiaChoThue() {
        return giaChoThue;
    }

    public void setGiaChoThue(double giaChoThue) {
        this.giaChoThue = giaChoThue;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
}

