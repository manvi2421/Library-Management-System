package com.application.courselibrary.controller;

import com.application.courselibrary.entity.Author;
import com.application.courselibrary.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@ResponseBody
@Controller
@RequestMapping("/library")
public class AuthorController {
    @Autowired
    public AuthorService authorService;

    @PostMapping("/postAuthor")
    public void addAuthor(@RequestBody Author author){
        authorService.addAuthor(author);
    }

    @PutMapping("/updateAuthor/{id}")
    public  void updateAuthor(@PathVariable int id, @RequestBody Author author){

        authorService.updateAuthor(author,id);

    }
    @DeleteMapping("deleteAuthor/{id}")
    public  void deleteAuthor(@PathVariable  int id){
        authorService.deleteAuthor(id);

    }
}
