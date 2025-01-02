package com.devrenan.cache.controller;

import com.devrenan.cache.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private CacheService cacheService;


    @PostMapping
    public void clear(@RequestParam("cacheName") String cacheName) {
        cacheService.evictAllCacheValues(cacheName);
    }

    @PutMapping
    public void atualizar() {
     cacheService.atualizaCacheEmpresas();
    }

}
