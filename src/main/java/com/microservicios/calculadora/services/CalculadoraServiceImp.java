package com.microservicios.calculadora.services;

import com.microservicios.calculadora.dominio.Operacion;
import com.microservicios.calculadora.dominio.repositorios.OperacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraServiceImp implements CalculadoraService{

    @Autowired
    OperacionRepository operacionRepository;

    @Override
    public double sumar(double x, double y) {
        double resultado = x+y;
        Operacion o = new Operacion("suma",x,y,resultado);
        operacionRepository.save(o);
        return resultado;
    }

    @Override
    public double restar(double x, double y) {
        double resultado =  x-y;
        Operacion o = new Operacion("resta",x,y,resultado);
        operacionRepository.save(o);
        return resultado;
    }

    @Override
    public double multiplicar(double x, double y) {
        double resultado =  x*y;
        Operacion o = new Operacion("multiplicacion",x,y,resultado);
        operacionRepository.save(o);
        return resultado;
    }

    @Override
    public double dividir(double x, double y) {
        double resultado =  x/y;
        Operacion o = new Operacion("division",x,y,resultado);
        operacionRepository.save(o);
        return resultado;
    }
}
