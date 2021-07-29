package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.AttachService;

import java.util.List;

@Service
public interface AttachServiceService {
    List<AttachService> findAll();
    AttachService findById(int id);
}
