package com.devrenan.cache.controller;


import com.devrenan.cache.entity.Empresa;
import com.devrenan.cache.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService  empresaService;

    @GetMapping
    private ResponseEntity<List<Empresa>> findAll() {
        List<Empresa> empresaServiceAll = empresaService.findAll();
        return ResponseEntity.ok(empresaServiceAll);
    }
}
