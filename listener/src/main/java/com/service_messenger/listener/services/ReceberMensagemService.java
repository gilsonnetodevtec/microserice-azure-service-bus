package com.service_messenger.listener.services;

import com.azure.spring.messaging.annotation.ServiceBusListener;
import org.springframework.stereotype.Service;

@Service
public class ReceberMensagemService {

    @ServiceBusListener(destination = "nome-da-fila")
    public void processarMensagem(String mensagem) {
        System.out.println("Mensagem recebida: " + mensagem);
    }
}

