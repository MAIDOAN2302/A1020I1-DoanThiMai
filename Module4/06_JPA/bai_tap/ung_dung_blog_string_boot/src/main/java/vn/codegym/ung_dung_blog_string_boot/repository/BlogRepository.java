package vn.codegym.ung_dung_blog_string_boot.repository;



import vn.codegym.ung_dung_blog_string_boot.model.Blog;

import java.util.List;

public interface BlogRepository {

        List<Blog> findAll();

        Blog findById(int id);

        void save(Blog blog);
        void update(Blog blog);

        void remove(Blog blog);
}
