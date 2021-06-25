package vn.codegym.ung_dung_blog_string_boot.service;



import vn.codegym.ung_dung_blog_string_boot.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    Blog findById(int id);

    void save(Blog blog);

    void remove(Blog blog);
    void update(Blog blog);
}
