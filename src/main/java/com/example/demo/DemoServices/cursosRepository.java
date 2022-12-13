package com.example.demo.DemoServices;

import com.example.demo.DemoEntity.cursosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface cursosRepository extends CrudRepository<cursosEntity,Integer> {
}
