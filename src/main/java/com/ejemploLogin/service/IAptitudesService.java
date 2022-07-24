
package com.ejemploLogin.service;

import com.ejemploLogin.model.Aptitudes;
import java.util.List;


public interface IAptitudesService {
    
    public List<Aptitudes> verAptitudes(); 
    public void crearAptitudes(Aptitudes apt);
    public void borrarAptitudes(Long id);
    public Aptitudes buscarAptitudes(Long id);
    public void editarAptitudes(Aptitudes apt);
}
