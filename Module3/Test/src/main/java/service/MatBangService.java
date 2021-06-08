package service;

import model.MatBang;

import java.sql.SQLException;
import java.util.List;

public interface MatBangService {
    List<MatBang> selectAllMatBang() throws SQLException;

    boolean createMatBang(MatBang matBang) throws SQLException;

    boolean deleteMatBang(int maMB) throws SQLException;

    boolean updateMatBang(MatBang matBang) throws SQLException;

    MatBang getMatBangByMaMB(int maMB) throws SQLException;

    List<MatBang> searchMatBang(String name) throws SQLException;
}
