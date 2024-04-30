package com.application.courselibrary.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private long ISBN;

    private String name;

    private String description;
    @ManyToMany(cascade = CascadeType.ALL)
    public List<Category> category;
    @ManyToMany(cascade = CascadeType.ALL)
    public  List<Author> author;
    @ManyToMany(cascade = CascadeType.ALL)
    public List<Publishers> publisher;


}
