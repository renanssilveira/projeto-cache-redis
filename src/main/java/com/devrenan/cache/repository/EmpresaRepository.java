package com.devrenan.cache.repository;

import com.devrenan.cache.entity.Empresa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
    public List<Empresa> findAll();
}
