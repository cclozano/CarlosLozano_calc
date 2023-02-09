package com.microservicios.calculadora.dominio;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter @Setter
@Entity
public class Operacion {

    public Operacion(String tipo, double parametro_x, double parametro_y, double resultado) {
        this.tipo = tipo;
        this.parametro_x = parametro_x;
        this.parametro_y = parametro_y;
        this.resultado = resultado;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private double parametro_x;
    private double parametro_y;
    private double resultado;


    public Operacion() {

    }

}
