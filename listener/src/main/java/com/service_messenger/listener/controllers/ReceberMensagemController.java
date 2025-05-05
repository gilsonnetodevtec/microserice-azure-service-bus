package com.service_messenger.listener.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service_messenger.listener.services.ReceberMensagemService;

@RestController
@RequestMapping("/api/receberMensagem")
public class ReceberMensagemController {
    
    private final ReceberMensagemService receberMensagemService;

    public ReceberMensagemController(ReceberMensagemService receberMensagemService) {
        this.receberMensagemService = receberMensagemService;
    }

    @GetMapping("/processar")
    public String processarMensagemManualmente() {
        // Essa chamada é só um exemplo. Se você quiser simular algo, implemente no service.
        return "Processamento manual acionado!";
    }
}
