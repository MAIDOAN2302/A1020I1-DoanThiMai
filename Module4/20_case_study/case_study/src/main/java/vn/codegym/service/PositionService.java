package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.Position;

import java.util.List;

@Service
public interface PositionService {
    List<Position> findAll();
    Position findById(int id);
}
