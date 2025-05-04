package com.service_messenger.send.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.azure.spring.messaging.servicebus.core.ServiceBusTemplate;

@Service
public class ProduzirMensagemService {

    @Autowired
    private ServiceBusTemplate serviceBusTemplate;

    public void enviarMensagem(String mensagem) {
        Message<String> message = MessageBuilder.withPayload(mensagem).build();

        serviceBusTemplate.sendAsync("nome-da-fila", message)
            .doOnSuccess(unused -> System.out.println("Mensagem enviada!"))
            .doOnError(error -> System.err.println("Erro: " + error.getMessage()))
            .subscribe();
    }
}

