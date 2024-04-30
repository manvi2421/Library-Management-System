package com.application.courselibrary.controller;

import com.application.courselibrary.entity.Books;
import com.application.courselibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ResponseBody
@Controller
@RequestMapping("/library")
public class BookContoller {
   @Autowired
    public BookService bookService;

   @GetMapping("/getAllBooks")
   public List<Books> getAllBooks(){
       return bookService.getAllBook();
   }
   @GetMapping("/getBook/{id}")
   public Books getBook(@PathVariable int id){
       return bookService.getBook(id);
   }
   @PostMapping("/postBook")
   public void addBook(@RequestBody Books book){
       bookService.addBooks(book);
   }
   @PutMapping("/UpdateBook/{id}")
   public void updateBook(@PathVariable int id,@RequestBody Books book){
       bookService.updateBook(book);
   }
   @DeleteMapping("/deleteBook/{id}")
   public void deleteBook(@PathVariable int id){
       bookService.deleteBook(id);
   }
}
