package com.application.courselibrary.repository;

import com.application.courselibrary.entity.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepo extends JpaRepository<Publishers,Integer> {
}
