package com.picpay.integration.cliente;

import com.picpay.domain.adapters.ClienteAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Exemplo de repository chamando DB, mas caso fosse HTTP poderia ser uma interface feign dentro do pacote Cliente
 * Geralmente nesses casos pode ser legal colocar uma pasta REQUEST e RESPONSE para mapear body etc
 */
@Component
public class ClienteAdapterImpl implements ClienteAdapter {
    private static final Logger logger = LoggerFactory.getLogger(ClienteAdapterImpl.class);

    @Override
    public void buscarUsuario(String idCliente) {
        logger.info("[INICIO] Consultando cliente por id {}",idCliente);
        logger.info("[FIM] Consultando client por id {}",idCliente);
    }
}
