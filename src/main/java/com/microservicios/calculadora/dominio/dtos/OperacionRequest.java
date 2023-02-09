package com.microservicios.calculadora.dominio.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OperacionRequest {
    public double parametro_1;
    public double parametro_2;

}
