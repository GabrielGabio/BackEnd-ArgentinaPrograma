
package com.ejemploLogin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String school;
    @NotNull
    private String title;
    @NotNull
    private String comienzo;
    @NotNull
    private String fin;
    @NotNull
    private String img;
    @NotNull
    private String enlace;
    

    public Educacion() {
    }

    public Educacion(@NotNull String school,@NotNull String title,@NotNull String comienzo,@NotNull String fin,@NotNull String img,@NotNull String enlace) {
        this.school = school;
        this.title = title;
        this.comienzo = comienzo;
        this.fin = fin;
        this.img = img;
        this.enlace = enlace;
    }

   
    
    
}
