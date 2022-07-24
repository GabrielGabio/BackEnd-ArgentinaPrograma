
package com.ejemploLogin.repository;

import com.ejemploLogin.model.Presentacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPresentacionRepository extends JpaRepository<Presentacion, Long>{
    
}
