package com.microservicios.calculadora.services;

import junit.framework.TestCase;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class CalculadoraServiceTest extends TestCase {


    CalculadoraServiceImp calculadoraService = new CalculadoraServiceImp();

    public void testSumar() {
        double r = calculadoraService.sumar(10,2);
        Assert.assertEquals(r,12.0,1);

    }

    public void testRestar() {
        double r = calculadoraService.restar(10,2);
        Assert.assertEquals(r,8.0,1);
    }

    public void testMultiplicar() {
        double r = calculadoraService.multiplicar(10,2);
        Assert.assertEquals(r,20.0,1);
    }

    public void testDividir() {
        double r = calculadoraService.dividir(10,2);
        Assert.assertEquals(r,5.0,1);
    }
}