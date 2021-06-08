package service.impl;

import model.MatBang;
import repository.MatBangRepository;
import repository.impl.MatBangRepositoryImpl;
import service.MatBangService;

import java.sql.SQLException;
import java.util.List;

public class MatBangServiceImpl implements MatBangService {
    MatBangRepository matBangRepository = new MatBangRepositoryImpl();
    @Override
    public List<MatBang> selectAllMatBang() throws SQLException {
        return this.matBangRepository.selectAllMatBang();
    }

    @Override
    public boolean createMatBang(MatBang matBang) throws SQLException {
        this.matBangRepository.createMatBang(matBang);
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
