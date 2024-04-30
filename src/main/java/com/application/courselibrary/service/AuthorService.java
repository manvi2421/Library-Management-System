package com.application.courselibrary.service;

import com.application.courselibrary.entity.Author;
import com.application.courselibrary.repository.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    public AuthorRepo authorRepo;

    Author authors;

    public void addAuthor(Author author){
        authorRepo.save(author);
    }

    public void updateAuthor(Author author, int id){
        if(authorRepo.existsById(id)) {
            authorRepo.save(author);
        }
        else{
            System.out.println("oppss..:( \n please enter valid Author ID!!");
        }
    }

    public  void deleteAuthor(int id){
        authorRepo.deleteById(id);
    }
}
