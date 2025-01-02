package com.devrenan.cache.agendador;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class CacheAgendado {

    //@Scheduled(fixedRate = 30, timeUnit = TimeUnit.SECONDS)
    @CacheEvict("empresas")
    public void limparCache() {
        System.out.println("Cache limpo");
    }
}
