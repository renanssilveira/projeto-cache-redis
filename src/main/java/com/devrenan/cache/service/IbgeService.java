package com.devrenan.cache.service;

import com.devrenan.cache.client.IbgeClient;
import com.devrenan.cache.client.IbgeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IbgeService {

    @Autowired
    private IbgeClient ibgeClient;

    @Cacheable(value = "estados", condition = "#estado == 'SP'")
    public List<IbgeResponse> findAllCidades(String estado) {
        return ibgeClient.findAllCidades(estado);
    }
}
