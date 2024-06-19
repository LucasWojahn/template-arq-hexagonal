package com.picpay.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigExample {

    private static final Logger logger = LoggerFactory.getLogger(ConfigExample.class);

    @Bean
    public Object templateExample(){
        logger.info("[INICIO] Exemplo criação bean clean arch");
        return new Object();
    }
}
