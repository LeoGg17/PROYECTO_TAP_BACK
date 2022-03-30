package com.proyecto.ProyectoTAP.controller;

import com.proyecto.ProyectoTAP.model.Cuentos;
import com.proyecto.ProyectoTAP.repository.CuentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.GET,
        RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/cuentos")
public class CuentosController {

    @Autowired
    CuentoRepositorio cuentoRepositorio;


    @PostMapping("/cuentos")
    public Cuentos create(@Validated @RequestBody Cuentos p) {
        return cuentoRepositorio.insert(p);
    }

    @GetMapping("/")
    public List<Cuentos> readAll() {
        return cuentoRepositorio.findAll();
    }


    @PutMapping("/cuentos/{_id}")
    public Cuentos  update(@PathVariable String _id, @Validated @RequestBody Cuentos p) {
        return cuentoRepositorio.save(p);
    }

    @DeleteMapping("/cuentos/{_id}")
    public void delete(@PathVariable String _id) {
        cuentoRepositorio.deleteById(_id);
    }

}
