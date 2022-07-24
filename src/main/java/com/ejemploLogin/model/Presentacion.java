
package com.ejemploLogin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Presentacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String backImage;
    @NotNull
    private String imgProfile;
    @NotNull
    private String name;
    @NotNull
    private String study;
    @NotNull
    private String curse;
    @NotNull
    private String ubi;

    public Presentacion() {
    }

    public Presentacion(@NotNull String backImage,@NotNull String imgProfile,@NotNull String name,@NotNull String study,@NotNull String curse,@NotNull String ubi) {
        this.backImage = backImage;
        this.imgProfile = imgProfile;
        this.name = name;
        this.study = study;
        this.curse = curse;
        this.ubi = ubi;
    }
    
}
