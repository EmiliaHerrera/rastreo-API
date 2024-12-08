package com.pedidos.encomiendas_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Entity
@Table(name = "envios")
public class Envio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_orden", nullable = false, unique = true)
    private String numeroOrden;

    @Column(name = "dni_receptor", nullable = false)
    private String dniReceptor;

    @Column(name = "apellido_receptor", nullable = false)
    private String apellidoReceptor;

    @Column(name = "estado_envio", nullable = false)
    private String estadoEnvio = "Pendiente";

    @Column(name = "empresa_transporte", nullable = false)
    private String empresaTransporte = "SHALOM";

    @Column(name = "fecha_creacion", updatable = false)
    private LocalDateTime fechaCreacion = LocalDateTime.now();

    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion = LocalDateTime.now();
}
