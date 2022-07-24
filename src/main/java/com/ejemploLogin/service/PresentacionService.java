
package com.ejemploLogin.service;

import com.ejemploLogin.model.Presentacion;
import com.ejemploLogin.repository.IPresentacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresentacionService implements IPresentacionService{
    
    @Autowired
    public IPresentacionRepository repo;
    
    @Override
    public List<Presentacion> verPresentacion() {
        return repo.findAll();
    }

    @Override
    public void crearPresentacion(Presentacion pre) {
        repo.save(pre);
    }

    @Override
    public void borrarPresentacion(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Presentacion buscarPresentacion(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void editarPresentacion(Presentacion pre) {
        repo.save(pre);
    }
    
}
