
package com.ejemploLogin.service;

import com.ejemploLogin.model.Encabezado;
import java.util.List;


public interface IEncabezadoService {
    
    public List<Encabezado> verEncabezado(); 
    public void crearEncabezado(Encabezado enca);
    public void borrarEncabezado(Long id);
    public Encabezado buscarEncabezado(Long id);
    public void editarEncabezado(Encabezado enca);
}

