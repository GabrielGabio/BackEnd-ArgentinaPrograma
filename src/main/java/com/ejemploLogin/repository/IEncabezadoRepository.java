
package com.ejemploLogin.repository;

import com.ejemploLogin.model.Encabezado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEncabezadoRepository extends JpaRepository<Encabezado, Long>{
    
}
