package com.application.courselibrary.service;

import com.application.courselibrary.entity.Publishers;
import com.application.courselibrary.repository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublisherService {
    @Autowired
    public PublisherRepo publisherRepo;

    public void addPublisher(Publishers publishers){
        publisherRepo.save(publishers);
    }
    public void updatePublisher(Publishers publishers){
        publisherRepo.save(publishers);
    }
    public void deletePublisher(int id){
        publisherRepo.deleteById(id);
    }

}

