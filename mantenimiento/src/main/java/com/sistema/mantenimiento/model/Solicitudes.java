package com.sistema.mantenimiento.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "solicitud")
public class Solicitudes {
    
    @Column(name = "seq_solicitud_servicio")
    private Long id;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "descripcion_problema")
    private String descripcion;
    @Column(name = "cod_estado")
    private int estado;
}
