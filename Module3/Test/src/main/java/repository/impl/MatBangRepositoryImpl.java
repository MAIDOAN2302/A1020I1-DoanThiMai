package repository.impl;

import model.MatBang;
import repository.BaseRepository;
import repository.MatBangRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MatBangRepositoryImpl implements MatBangRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL = "SELECT * FROM mat_bang.mat_bang;";
    private static final String INSERT_MB = "insert into mat_bang\n" +
            "values(?,?,?,?,?,?,?,?,?)";

    @Override
    public List<MatBang> selectAllMatBang() throws SQLException {
        List<MatBang> matBangList = new ArrayList<>();
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String maMB = resultSet.getString("ma_mat_bang");
            double dienTich = resultSet.getDouble("dien_tich");
            String trangThai = resultSet.getString("trang_thai");
            int tang = resultSet.getInt("tang");
            int idLoaiVP = resultSet.getInt("id_loai_VP");
            String moTa = resultSet.getString("mo_ta_chi_tiet");
            double giaThue = resultSet.getDouble("gia_cho_thue");
            String ngayBatDau = resultSet.getString("ngay_bat_dau");
            String ngayKetThuc = resultSet.getString("ngay_ket_thuc");
            matBangList.add(new MatBang(maMB, dienTich, trangThai, tang, idLoaiVP, moTa, giaThue, ngayBatDau, ngayKetThuc));
        }
        return matBangList;
    }

    @Override
    public boolean createMatBang(MatBang matBang) throws SQLException {
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(INSERT_MB);
        preparedStatement.setString(1,matBang.getMaMatBang());
        preparedStatement.setDouble(2,matBang.getDienTich());
        preparedStatement.setString(3,matBang.getTrangThai());
        preparedStatement.setInt(4,matBang.getTang());
        preparedStatement.setInt(5,matBang.getIdLoaiVp());
        preparedStatement.setString(6,matBang.getMoTaChiTiet());
        preparedStatement.setDouble(7,matBang.getGiaChoThue());
        preparedStatement.setString(8,matBang.getNgayBatDau());
        preparedStatement.setString(9,matBang.getNgayKetThuc());
        preparedStatement.executeUpdate();
        return false;
    }

    @Override
    public boolean deleteMatBang(int maMB) throws SQLException {
        return false;
    }

    @Override
    public boolean updateMatBang(MatBang matBang) throws SQLException {
        return false;
    }

    @Override
    public MatBang getMatBangByMaMB(int maMB) throws SQLException {
        return null;
    }

    @Override
    public List<MatBang> searchMatBang(String name) throws SQLException {
        return null;
    }
}
