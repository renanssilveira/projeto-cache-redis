package com.devrenan.cache.controller;

import com.devrenan.cache.client.IbgeResponse;
import com.devrenan.cache.service.IbgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ibge")
public class IbgeController {

    @Autowired
    private IbgeService ibgeService;

    @GetMapping
    public ResponseEntity<List<IbgeResponse>> findAllCidades(@RequestParam String uf) {
        return ResponseEntity.ok(ibgeService.findAllCidades(uf));
    }

}
