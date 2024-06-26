package com.picpay.delivery.controller.impl;

import com.picpay.delivery.controller.ControllerExample;
import com.picpay.domain.ports.ExecutaExemploServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExampleImpl implements ControllerExample {
    /**
     * Em teoria esta errado esse autowired pq vc vai estar acoplando algo do domain
     * ao gerenciamento de dependencia do SPRING
     */
//    @Autowired
    private final ExecutaExemploServicePort executaExemploServicePort;

    public ControllerExampleImpl(ExecutaExemploServicePort service) {
        this.executaExemploServicePort = service;
    }


    @Override
    public final ResponseEntity<Object> postExample(String param) {
        executaExemploServicePort.exemplo(param);
        return null;
    }
}
