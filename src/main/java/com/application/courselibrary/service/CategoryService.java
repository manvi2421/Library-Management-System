package com.application.courselibrary.service;

import com.application.courselibrary.entity.Author;
import com.application.courselibrary.entity.Category;
import com.application.courselibrary.repository.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    public CategoryRepo categoryRepo;

    public void addCategory(Category category){
        categoryRepo.save(category);
    }

    public void updateCategory(Category category){
        categoryRepo.save(category);
    }

    public void deleteCategory(int id){
        categoryRepo.deleteById(id);
    }

}
