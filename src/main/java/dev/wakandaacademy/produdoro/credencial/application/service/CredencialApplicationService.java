package dev.wakandaacademy.produdoro.credencial.application.service;

import dev.wakandaacademy.produdoro.usuario.aplication.api.UsuarioNovoRequest;
import jakarta.validation.Valid;

public interface CredencialApplicationService {
    default void criaNovaCredencial(@Valid UsuarioNovoRequest usuarioNovo) {

    }
}
