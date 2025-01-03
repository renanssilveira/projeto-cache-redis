package com.devrenan.cache.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "ibge-ms", url = "https://servicodados.ibge.gov.br/api/v1/localidades/estados")
public interface IbgeClient {

    @RequestMapping(method = RequestMethod.GET, value = "/{estado}/municipios")
    List<IbgeResponse> findAllCidades(@PathVariable("estado") String estado);
}


