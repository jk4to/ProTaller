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
@Table(name = "mantenimiento_correctivos")
public class Mantenimiento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq_mantenimiento_correctivo", nullable = false)
    private Long id;
    @Column(name = "fecha_finalizacion")
    private Date fec_finalizacion;
    @Column(name = "comentario_detencion_falla", nullable = false, length = 1500)
    private String comentario_falla;
    @Column(name = "descripcion_causa", length = 1500)
    private String descrip_causa;
    @Column(name = "cod_tipo_solucion", nullable = false, length = 20)
    private String tipo_solucion;
    @Column(name = "descripcion_solucion", length = 1500)
    private String descrip_solucion;
    @Column(name = "duracion", nullable = false, length = 6)
    private String duracion;
    @Column(name = "comentarios", nullable = false, length = 2500)
    private String comentario;
    @Column(name = "cod_estado", nullable = false, columnDefinition = "integer default 1")
    private int estado;
}
