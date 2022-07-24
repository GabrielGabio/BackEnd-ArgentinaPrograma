package com.ejemploLogin.service;

import com.ejemploLogin.model.Proyectos;
import com.ejemploLogin.repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService{

    @Autowired
    public IProyectosRepository proRepo;
    
    @Override
    public List<Proyectos> verProyectos() {
        return proRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyectos(Long id) {
        proRepo.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
        return proRepo.findById(id).orElse(null);
    }

    @Override
    public void editarProyectos(Proyectos pro) {
        proRepo.save(pro);
    }
    
}
