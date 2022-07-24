package com.ejemploLogin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity @Getter @Setter
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String comienzo;
    private String fin;
    private String about;
    private String urlGitHub;
    private String textUrlGitHub;
    private String urlProyecto;
    private String textUrlProyecto;

    public Proyectos() {
    }

    public Proyectos(String name, String comienzo, String fin, String about, String urlGitHub, String textUrlGitHub, String urlProyecto, String textUrlProyecto) {
        this.name = name;
        this.comienzo = comienzo;
        this.fin = fin;
        this.about = about;
        this.urlGitHub = urlGitHub;
        this.textUrlGitHub = textUrlGitHub;
        this.urlProyecto = urlProyecto;
        this.textUrlProyecto = textUrlProyecto;
    }
    
    
}
