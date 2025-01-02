package com.devrenan.cache.service;

import com.devrenan.cache.entity.Empresa;
import com.devrenan.cache.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;
    @Cacheable("empresas")
    public List<Empresa> findAll() {
        List<Empresa> empresasList = new ArrayList<>();
        empresasList.addAll((Collection<? extends Empresa>) empresaRepository.findAll());

        return empresasList;
    }
}
