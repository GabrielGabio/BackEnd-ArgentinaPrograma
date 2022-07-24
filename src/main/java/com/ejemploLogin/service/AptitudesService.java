
package com.ejemploLogin.service;

import com.ejemploLogin.model.Aptitudes;
import com.ejemploLogin.repository.IAptitudesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AptitudesService implements IAptitudesService{
    
    @Autowired
    public IAptitudesRepository aptRepo;
    
    @Override
    public List<Aptitudes> verAptitudes() {
       return aptRepo.findAll();
    }

    @Override
    public void crearAptitudes(Aptitudes apt) {
        aptRepo.save(apt);
    }

    @Override
    public void borrarAptitudes(Long id) {
        aptRepo.deleteById(id);
    }

    @Override
    public Aptitudes buscarAptitudes(Long id) {
        return aptRepo.findById(id).orElse(null);
    }

    @Override
    public void editarAptitudes(Aptitudes apt) {
        aptRepo.save(apt);
    }
    
}
