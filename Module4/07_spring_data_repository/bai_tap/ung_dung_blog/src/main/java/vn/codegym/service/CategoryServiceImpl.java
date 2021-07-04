package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.Blog;
import vn.codegym.model.Category;
import vn.codegym.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryRepository repository;

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }
}
