package com.proyecto.ProyectoTAP.repository;

import com.proyecto.ProyectoTAP.model.Cuentos;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CuentoRepositorio  extends MongoRepository<Cuentos, String> {}