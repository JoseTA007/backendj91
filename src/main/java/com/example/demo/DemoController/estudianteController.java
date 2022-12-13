package com.example.demo.DemoController;

import com.example.demo.DemoEntity.cursosEntity;
import com.example.demo.DemoEntity.estudianteEntity;
import com.example.demo.DemoServices.estudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolutionException;
import java.util.List;

@RestController
@RequestMapping("/estudiante") //-> LA CLASE SE LLAMA estudianteController EL @REQUES... LO CAMBIA A  "//estudiante"
@CrossOrigin(origins = "http://localhost:4200/")
public class estudianteController {
    @Autowired//SIRVE ASIGNAR EN UNA VARIABLE EL CRUD PARA USAR EL CRUD EN TODOS LOS @ QUE USAREMOS "estRepo"
    private estudianteRepository estuRepo;//estudianteRepository ->referencia a la clase a usar estRepo->nombre de la variable
    //***GET
    @GetMapping //-> PRIMER USO GET
    public List<estudianteEntity> obtenerEstudiante (){
        return (List <estudianteEntity>) estuRepo.findAll();
    }
    //***POST
    @PostMapping //-> SEGUNDO USO
    public void agregarEstudiante (@RequestBody estudianteEntity estEn) {
        estuRepo.save(estEn);
    }
    //**PUT
    @PutMapping //-> TERCER USO
    public void actualizarEstudiante (@RequestBody estudianteEntity estEn) {
        estuRepo.save(estEn);
    }
    //***DELETE
    @DeleteMapping//->CUARTO USO
    public void eliminarEstudiante(@RequestBody estudianteEntity estEn){estuRepo.deleteById(estEn.getIdestudiante());}

    @GetMapping("/{id}")
    public ResponseEntity<estudianteEntity> obtenerEstudintePorID(@PathVariable("id") Integer  idEntity){
        estudianteEntity estuEntity = estuRepo.findById(idEntity)
                .orElseThrow(() -> new ResolutionException("No existe el estudiante"));
        return ResponseEntity.ok(estuEntity);
    }


    //**PUT
    @PutMapping("/{id}")
    public void modificarEstudianteUnico(@PathVariable("id")Integer  id , @RequestBody estudianteEntity estEn) {
        estuRepo.save (estEn);
        estEn.setIdestudiante(id);
    }
    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable("id")Integer  id){
        estuRepo.deleteById(id);
    }
}
