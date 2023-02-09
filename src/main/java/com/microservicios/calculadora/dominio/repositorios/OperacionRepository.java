package com.microservicios.calculadora.dominio.repositorios;

import com.microservicios.calculadora.dominio.Operacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperacionRepository extends JpaRepository<Operacion,Long> {
}
