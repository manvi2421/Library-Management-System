package com.application.courselibrary.repository;

import com.application.courselibrary.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepo extends JpaRepository<Books,Integer> {
}
