package com.sistema.mantenimiento.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tecnicos_ejecutables")
public class tecnicos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq_tecnico_ejecutable", nullable = false)
    private Long id;
    @Column(name = "fechadeasignacion", nullable = false)
    private Date fecha;
    @Column(name = "cod_responsable", columnDefinition = "integer default 0")
    private int cod_responsable;
    @Column(name = "cod_estado", columnDefinition = "integer default 1")
    private int estado;
}
