
package com.ejemploLogin.repository;

import com.ejemploLogin.model.Aptitudes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAptitudesRepository extends JpaRepository<Aptitudes, Long>{
    
}
