package com.codegym.service;

import com.codegym.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    List<Book> findAll();

    Book findById(int id);

    void save (Book book);

    void delete (int id);
}
