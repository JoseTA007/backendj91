package com.example.demo.DemoEntity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Document(collection = "Cursos")
public class cursomgEntity implements Serializable {
    @Id

    private String id ;
    private String nombcurso;
    private Integer creditos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombcurso() {
        return nombcurso;
    }

    public void setNombcurso(String nombrecurso) {
        this.nombcurso = nombrecurso;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
}
