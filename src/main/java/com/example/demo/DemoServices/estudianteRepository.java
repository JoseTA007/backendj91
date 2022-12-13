package com.example.demo.DemoServices;

import com.example.demo.DemoEntity.estudianteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface estudianteRepository extends CrudRepository<estudianteEntity,Integer> {
}
