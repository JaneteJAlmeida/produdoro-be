package dev.wakandaacademy.produdoro.usuario.aplication.api;

import java.util.UUID;

public class UsuarioCriadoResponse {
    private final UUID idUsuario;
    private final String email;

    public UsuarioCriadoResponse(UUID idUsuario, String email) {
        this.idUsuario = idUsuario;
        this.email = email;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public String getEmail() {
        return email;
    }
}