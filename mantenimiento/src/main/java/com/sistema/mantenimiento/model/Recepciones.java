package com.sistema.mantenimiento.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recepcion_activo")
public class Recepciones {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq_respcion_activo")
    private Long id;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "seq_estado")
    private int estado;
}
