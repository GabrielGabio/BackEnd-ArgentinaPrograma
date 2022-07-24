package com.ejemploLogin.controller;

import com.ejemploLogin.dto.Mensaje;
import com.ejemploLogin.model.Presentacion;
import com.ejemploLogin.service.IPresentacionService;
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
@RequestMapping("/presentacion")
@CrossOrigin
public class PresentacionController {

    @Autowired
    IPresentacionService preServ;

    
    @GetMapping("/ver")
    public List<Presentacion> verPresentacion() {
        return preServ.verPresentacion();
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void crearPresentacion(@RequestBody Presentacion enca) {
        preServ.crearPresentacion(enca);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarPresentacion(@PathVariable Long id) {
        preServ.borrarPresentacion(id);
    }

   
    @GetMapping("/ver/{id}")
    public Presentacion buscarPresentacion(@PathVariable Long id) {
        return preServ.buscarPresentacion(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public ResponseEntity editarPresentacion(@PathVariable Long id,
            @RequestBody Presentacion presentacion) 
            //@RequestParam(required = false, name = "backImage") String backImage,
            //@RequestParam(required = false, name = "imgProfile") String imgProfile,
            //@RequestParam(required = false, name = "name") String name,
            //@RequestParam(required = false, name = "study") String study,
            //@RequestParam(required = false, name = "curse") String curse,
            //@RequestParam(required = false, name = "ubi") String ubi) 
            {

        Presentacion pre = preServ.buscarPresentacion(id);

        pre.setBackImage(presentacion.getBackImage());
        pre.setCurse(presentacion.getCurse());
        pre.setImgProfile(presentacion.getImgProfile());
        pre.setName(presentacion.getName());
        pre.setStudy(presentacion.getStudy());
        pre.setUbi(presentacion.getUbi());
        
        preServ.editarPresentacion(pre);
        return new ResponseEntity(new Mensaje("Presentacion actualizada"), HttpStatus.OK);
    }

}
