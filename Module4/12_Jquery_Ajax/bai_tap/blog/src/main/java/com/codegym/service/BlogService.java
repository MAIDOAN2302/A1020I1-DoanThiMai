package com.codegym.service;

import com.codegym.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {
    List<Blog> findAll();

    Blog findById(int id);

    Blog save(Blog blog);

    void delete(int id);

    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findAllByCategory_Id(int category_id, Pageable pageable);
}
