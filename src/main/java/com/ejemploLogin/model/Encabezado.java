
package com.ejemploLogin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity @Setter @Getter
public class Encabezado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    public String name;
    @NotNull
    private String program;

    public Encabezado() {
    }

    public Encabezado(@NotNull String name,@NotNull String program) {
        this.name = name;
        this.program = program;
    }
    
    
    
}
