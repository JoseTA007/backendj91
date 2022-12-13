package com.example.demo.DemoServices;

import com.example.demo.DemoEntity.cursomgEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.Serializable;

@Repository
@CrossOrigin(value = {})
public interface cursosmgRepository extends MongoRepository<cursomgEntity, Serializable> {
}
