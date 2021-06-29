package com.example.demo.Service;

import com.example.demo.Repository.BlogRepository;
import com.example.demo.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findBlogById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void saveBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteBlogById(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> fillAllBlog(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }


    @Override
    public Page<Blog> findAllByAuthor(String author, Pageable pageable) {
        return blogRepository.findByAuthor(author, pageable);
    }

    @Override
    public Page<Blog> findAllBlogByECommerce(int id, Pageable pageable) {
        return blogRepository.findAllBlogByEcommerceId(id, pageable);
    }
}
