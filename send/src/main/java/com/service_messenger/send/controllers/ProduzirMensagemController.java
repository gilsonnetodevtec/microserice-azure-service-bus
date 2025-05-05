package com.service_messenger.send.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service_messenger.send.services.ProduzirMensagemService;

@RestController
@RequestMapping("/api/produzirMensagem")
public class ProduzirMensagemController {

    @Autowired
    private ProduzirMensagemService produzirMensagemService;
    
    @GetMapping("/enviar")
    public void enviarMensagem() {
        produzirMensagemService.enviarMensagem("Mensagem de teste");
    }
    
}
