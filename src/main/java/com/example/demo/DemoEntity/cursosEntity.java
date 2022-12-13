package com.example.demo.DemoEntity;

import javax.persistence.*;

@Entity
@Table(name = "cursos")//->referencia a la tabla
public class cursosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcursos ;
    private String nombrecurso;
    private Integer creditos;

    public Integer getIdcursos() {
        return idcursos;
    }

    public void setIdcursos(Integer idcursos) {
        this.idcursos = idcursos;
    }

    public String getNombrecurso() {
        return nombrecurso;
    }

    public void setNombrecurso(String nombrecurso) {
        this.nombrecurso = nombrecurso;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }
}
