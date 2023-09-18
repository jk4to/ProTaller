package com.sistema.mantenimiento.model;

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
@Table(name = "personas")
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq_persona", nullable = true)
    private Long id;

    @Column(name = "cedula", nullable = false, length = 15)
    private String ci;
    @Column(name = "nombres", nullable = false, length = 40)
    private String nombre;
    @Column(name = "apellido_paterno", nullable = false, length = 40)
    private String ap;
    @Column(name = "apellido_materno", nullable = false, length = 40)
    private String am;
    @Column(name = "fotografia", nullable = false, length = 15)
    private String foto;
    @Column(name = "telefono_celular", nullable = false, length = 15)
    private String telefono;
    @Column(name = "cod_tipo", nullable = false, length = 15)
    private String cod_tipo;
    @Column(name = "cod_estado")
    private int estado;

}
