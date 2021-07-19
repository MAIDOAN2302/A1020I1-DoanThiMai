package com.codegym.service.impl;

import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.codegym.model.Blog;
import com.codegym.repository.BlogRepository;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllByCategory(int category_id, Pageable pageable) {
        return blogRepository.findAllByCategory_Id(category_id, pageable);
    }

    @Override
    public Page<Blog> findBlogsByTitleContainsOrContentContains(String title, String content, Pageable pageable) {
        return blogRepository.findBlogsByTitleContainsOrContentContains(title, content, pageable);
    }

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public List<Blog> findAllByCategory(int category_id) {
        return blogRepository.findAllByCategory_Id(category_id);
    }


    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public Blog save(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void delete(int id) {
        blogRepository.delete(blogRepository.getOne(id));
    }
}