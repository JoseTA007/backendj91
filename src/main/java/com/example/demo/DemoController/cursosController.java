package com.example.demo.DemoController;

import com.example.demo.DemoEntity.cursosEntity;
import com.example.demo.DemoServices.cursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos") //-> LA CLASE SE LLAMA CURSOSCONTROLLER EL @REQUES... LO CAMBIA A  "/cursos"
public class cursosController {
    @Autowired
    private cursosRepository curRepo;//cursosRepository ->referencia a la clase a usar curRepo->nombre de la variable
    //**SELECT
    @GetMapping //-> PRIMER USO GET
    public List<cursosEntity> obtenerCurso (){
        return (List <cursosEntity>) curRepo.findAll();
    }
    //**INSERT
    @PostMapping //-> SEGUNDO USO, como el formato json va sin id lo agrega como nuevo
    public void agregarCursos (@RequestBody cursosEntity curEn){
        curRepo.save(curEn);
    }
    //**UPDATE
    @PutMapping //-> TERCER USO, con el id si el objeto existe lo modifica, sino colocas el id actua como Post...
    public void actualizarCurso (@RequestBody cursosEntity curEn) {
        curRepo.save(curEn);
    }
    //***DELETE
    @DeleteMapping//->CUARTO USO
    public void eliminarCurso(@RequestBody cursosEntity curEn){
        curRepo.deleteById(curEn.getIdcursos());
    }
}
