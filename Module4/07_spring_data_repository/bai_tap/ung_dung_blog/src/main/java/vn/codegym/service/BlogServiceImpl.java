package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Blog;
import vn.codegym.repository.BlogRepository;

import java.util.List;
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
    blogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
    blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> fillAllBlog(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Page<Blog> findAllByName(String name, Pageable pageable) {
        return blogRepository.findAllByName(name,pageable);
    }
}
