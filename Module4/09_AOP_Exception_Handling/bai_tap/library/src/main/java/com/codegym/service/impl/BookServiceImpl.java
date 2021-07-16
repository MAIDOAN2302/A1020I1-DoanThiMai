package com.codegym.service.impl;

import com.codegym.model.Book;
import com.codegym.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Override
    public List<Book> findAll() {
        return null;
    }

    @Override
    public Book findById(int id) {
        return null;
    }

    @Override
    public void save(Book book) {

    }

    @Override
    public void delete(int id) {

    }
}
