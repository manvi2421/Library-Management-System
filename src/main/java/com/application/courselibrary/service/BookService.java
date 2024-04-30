package com.application.courselibrary.service;

import com.application.courselibrary.entity.Books;
import com.application.courselibrary.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    public BookRepo bookRepo;

    public List<Books> getAllBook(){
        return bookRepo.findAll();
    }

    public Books getBook(int id){
        return bookRepo.findById(id).orElseThrow(()-> new RuntimeException(
                "ID Does not exists"
        ));

    }
    public void addBooks(Books books){
        bookRepo.save(books);
    }

    public void updateBook(Books book){
        bookRepo.save(book);
    }

    public  void deleteBook(int id){
        bookRepo.deleteById(id);
    }


}
