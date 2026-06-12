package dev.wakandaacademy.produdoro.usuario.aplication.api;

public interface UsuarioService {
    UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovoRequest);
}