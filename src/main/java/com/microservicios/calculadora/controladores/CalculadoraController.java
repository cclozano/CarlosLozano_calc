package com.microservicios.calculadora.controladores;

import com.microservicios.calculadora.dominio.Operacion;
import com.microservicios.calculadora.dominio.dtos.OperacionRequest;
import com.microservicios.calculadora.dominio.repositorios.OperacionRepository;
import com.microservicios.calculadora.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CalculadoraController {


    @Autowired
    CalculadoraService calculadoraService;
    @Autowired
    OperacionRepository operacionRepository;
    @RequestMapping(value = "/suma", method = RequestMethod.POST)
    public ResponseEntity<Double> sumar(@RequestBody OperacionRequest request) {
        try {
            Double respuesta = calculadoraService.sumar(request.getParametro_1(), request.getParametro_2());
            return new ResponseEntity<>(respuesta,HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity(e,HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/resta", method = RequestMethod.POST)
    public ResponseEntity<Double> restar(@RequestBody OperacionRequest request) {
        try {
            Double respuesta = calculadoraService.restar(request.getParametro_1(), request.getParametro_2());
            return new ResponseEntity<>(respuesta,HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity(e,HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/multiplicacion", method = RequestMethod.POST)
    public ResponseEntity<Double> multiplicar(@RequestBody OperacionRequest request) {
        try {
            Double respuesta = calculadoraService.multiplicar(request.getParametro_1(), request.getParametro_2());
            return new ResponseEntity<>(respuesta,HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity(e,HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/division", method = RequestMethod.POST)
    public ResponseEntity<Double> dividir(@RequestBody OperacionRequest request) {
        try {
            Double respuesta = calculadoraService.dividir(request.getParametro_1(), request.getParametro_2());
            return new ResponseEntity<>(respuesta,HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity(e,HttpStatus.CONFLICT);
        }
    }

    @GetMapping("/operaciones")
    public List<Operacion> listar()
    {
        return operacionRepository.findAll();
    }

}
