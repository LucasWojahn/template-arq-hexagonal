package com.picpay.domain.service;

import com.picpay.domain.adapters.ClienteAdapter;
import com.picpay.domain.ports.ExecutaExemploService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ExecutaExemploServiceImpl implements ExecutaExemploService {
    private static final Logger logger = LoggerFactory.getLogger(ExecutaExemploServiceImpl.class);


    private final ClienteAdapter cliente;

    public ExecutaExemploServiceImpl(ClienteAdapter cliente){
        this.cliente = cliente;
    }

    @Override
    public void exemplo(String exemplo) {
        logger.info("[INICIO] Service consulta cliente {}",exemplo);
        cliente.buscarUsuario(exemplo);
        logger.info("[FIM] Service consulta cliente {}",exemplo);
    }
}
