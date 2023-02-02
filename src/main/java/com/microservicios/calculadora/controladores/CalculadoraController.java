package com.microservicios.calculadora.controladores;

import com.microservicios.calculadora.dominio.calculadora;
import com.microservicios.calculadora.dominio.repositorio.EspecieRepositorio;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.AuthorizationScope;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@EnableResourceServer
public class EspecieControlador {

    @ApiOperation(value = "", authorizations = { @Authorization(value="apiKey") })
    @PostMapping("/suma")
    public Especie agregar(@RequestBody double x, @RequestBody double y) {
        return x + y;
    }

}
