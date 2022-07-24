
package com.ejemploLogin.service;

import com.ejemploLogin.model.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List<Proyectos> verProyectos(); 
    public void crearProyectos(Proyectos pro);
    public void borrarProyectos(Long id);
    public Proyectos buscarProyectos(Long id);
    public void editarProyectos(Proyectos pro);
}
