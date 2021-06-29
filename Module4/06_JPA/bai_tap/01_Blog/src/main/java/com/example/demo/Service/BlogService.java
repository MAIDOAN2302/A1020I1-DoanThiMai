package com.example.demo.Service;

import com.example.demo.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {
    List<Blog> findAllBlog();

    Blog findBlogById(int id);

    void saveBlog(Blog blog);

    void deleteBlogById(int id);

    Page<Blog> fillAllBlog(Pageable pageable);

    Page<Blog> findAllByAuthor(String author, Pageable pageable);

    Page<Blog> findAllBlogByECommerce(int id, Pageable pageable);
}
