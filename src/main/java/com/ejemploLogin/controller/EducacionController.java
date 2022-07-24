
package com.ejemploLogin.controller;

import com.ejemploLogin.dto.Mensaje;
import com.ejemploLogin.model.Educacion;
import com.ejemploLogin.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/educacion")
@CrossOrigin
public class EducacionController {
    
    @Autowired
    IEducacionService eduServ;
    
    
    @GetMapping("/ver")
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void crearEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }

    
    @GetMapping("/ver/{id}")
    public Educacion buscarEducacion(@PathVariable("id") Long id) {
        return eduServ.buscarEducacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public ResponseEntity editarEducacion(@PathVariable Long id,
            @RequestBody Educacion educacion){
           // @RequestParam(required=false,name="school") String school,
           // @RequestParam(required=false,name="title") String title,
            //@RequestParam(required=false,name="comienzo") String comienzo,
            //@RequestParam(required=false,name="fin") String fin,
            //@RequestParam(required=false,name="img") String img,
            //@RequestParam(required=false,name="enlace") String enlace) {
        
        Educacion edu = eduServ.buscarEducacion(id);
        
        edu.setSchool(educacion.getSchool());
        edu.setTitle(educacion.getTitle());
        edu.setComienzo(educacion.getComienzo());
        edu.setFin(educacion.getFin());
        edu.setImg(educacion.getImg());
        edu.setEnlace(educacion.getEnlace());
        
        eduServ.editarEducacion(edu);
        return new ResponseEntity(new Mensaje("Producto actualizado"), HttpStatus.OK);
    }
}
