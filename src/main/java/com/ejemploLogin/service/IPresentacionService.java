
package com.ejemploLogin.service;

import com.ejemploLogin.model.Presentacion;
import java.util.List;


public interface IPresentacionService {
    
    public List<Presentacion> verPresentacion(); 
    public void crearPresentacion(Presentacion pre);
    public void borrarPresentacion(Long id);
    public Presentacion buscarPresentacion(Long id);
    public void editarPresentacion(Presentacion pre);
}
