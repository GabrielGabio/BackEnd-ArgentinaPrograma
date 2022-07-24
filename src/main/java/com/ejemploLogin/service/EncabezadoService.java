
package com.ejemploLogin.service;

import com.ejemploLogin.model.Encabezado;
import com.ejemploLogin.repository.IEncabezadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EncabezadoService implements IEncabezadoService{

    @Autowired
    public IEncabezadoRepository encaRepo;
    
    @Override
    public List<Encabezado> verEncabezado() {
        return encaRepo.findAll();
    }

    @Override
    public void crearEncabezado(Encabezado enca) {
        encaRepo.save(enca);
    }

    @Override
    public void borrarEncabezado(Long id) {
        encaRepo.deleteById(id);
    }

    @Override
    public Encabezado buscarEncabezado(Long id) {
        return encaRepo.findById(id).orElse(null);
    }

    @Override
    public void editarEncabezado(Encabezado enca) {
        encaRepo.save(enca);
    }
    
}
