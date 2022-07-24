package com.ejemploLogin.controller;

import com.ejemploLogin.model.Encabezado;
import com.ejemploLogin.service.IEncabezadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/encabezado")
@CrossOrigin
public class EncabezadoController {

    @Autowired
    IEncabezadoService encaServ;
    
  
    @GetMapping("/ver")
    public List<Encabezado> verEncabezado() {
        return encaServ.verEncabezado();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/new")
    public void crearEncabezado(@RequestBody Encabezado enca) {
        encaServ.crearEncabezado(enca);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarEncabezado(@PathVariable Long id) {
        encaServ.buscarEncabezado(id);
    }

    
    @GetMapping("/ver/{id}")
    public Encabezado buscarEncabezado(@PathVariable Long id) {
        return encaServ.buscarEncabezado(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Encabezado editarEncabezado(@PathVariable Long id,
            @RequestParam String name,
            @RequestParam String program) {
        
        Encabezado enca = encaServ.buscarEncabezado(id);
        
        enca.setName(name);
        enca.setProgram(program);
        
        encaServ.editarEncabezado(enca);
        return enca;
    }
}
