package com.application.courselibrary.controller;

import com.application.courselibrary.entity.Category;
import com.application.courselibrary.entity.Publishers;
import com.application.courselibrary.service.CategoryService;
import com.application.courselibrary.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("/library")
public class PublisherController {

    @Autowired
    public PublisherService publisherService;

    @PostMapping("/postPublisher")
    public void addPublisher(@RequestBody Publishers publishers){
        publisherService.addPublisher(publishers);
    }

    @PutMapping("/updatePublisher/{id}")
    public  void updatePublisher(@PathVariable int id, @RequestBody Publishers publishers){

        publisherService.updatePublisher(publishers);

    }
    @DeleteMapping("deletePublisher/{id}")
    public  void deletePublisher(@PathVariable  int id){
        publisherService.deletePublisher(id);

    }
}
