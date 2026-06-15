package dev.wakandaacademy.produdoro.credencial.application.service;

import dev.wakandaacademy.produdoro.usuario.aplication.api.UsuarioNovoRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CredencialService implements CredencialApplicationService {

    @Override
    public void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo){
        //TODOD Implementar metodo para criar nova credencial
    }
}