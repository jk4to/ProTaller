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
@Table(name = "ordenes_trabajo")
public class Ordenes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq_orden_trabajo", nullable = false)
    private Long id;
    @Column(name = "cod_tipo_mantenimiento", nullable = false)
    private String tipo;
    @Column(name = "numero_orden_trabajo", nullable = false, length = 50)
    private String num_orden;
    @Column(name = "fecha_emision", nullable = false)
    private Date fec_emision;
    @Column(name = "ubicacion_activo", nullable = true, length = 250)
    private String ubicacion;
    @Column(name = "cod_atendido", nullable = false)
    private int cod_atendido;
    @Column(name = "cod_estado", nullable = false, columnDefinition = "integer default 1")
    private int estado;
}
