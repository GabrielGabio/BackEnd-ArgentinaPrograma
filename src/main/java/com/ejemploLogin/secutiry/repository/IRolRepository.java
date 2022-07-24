package com.ejemploLogin.secutiry.repository;


import com.ejemploLogin.secutiry.entity.Rol;
import com.ejemploLogin.secutiry.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}