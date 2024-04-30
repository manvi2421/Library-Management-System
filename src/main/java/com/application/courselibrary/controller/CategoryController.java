package com.application.courselibrary.controller;

import com.application.courselibrary.entity.Author;
import com.application.courselibrary.entity.Category;
import com.application.courselibrary.service.AuthorService;
import com.application.courselibrary.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@ResponseBody
@RequestMapping("/library")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @PostMapping("/postCategory")
    public void addCategory(@RequestBody Category category){
        categoryService.addCategory(category);
    }

    @PutMapping("/updateCategory/{id}")
    public  void updateCategory(@PathVariable int id, @RequestBody Category category){

        categoryService.updateCategory(category);

    }
    @DeleteMapping("deleteCategory/{id}")
    public  void deleteCategory(@PathVariable  int id){
        categoryService.deleteCategory(id);

    }
}
