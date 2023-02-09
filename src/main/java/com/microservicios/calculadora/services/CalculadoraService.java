package com.microservicios.calculadora.services;

import org.springframework.stereotype.Component;

public interface CalculadoraService {
    double sumar(double x, double y);
    double restar(double x, double y);
    double multiplicar(double x, double y);
    double dividir(double x, double y);
}
