package dev.wakandaacademy.produdoro.usuario.domain;

import dev.wakandaacademy.produdoro.usuario.aplication.api.UsuarioNovoRequest;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

@Document(collection = "Usuario")
public class Usuario {
    @Id
    private UUID idUsuario;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(UsuarioNovoRequest usuarioNovoRequest) {
        this.idUsuario = UUID.randomUUID();
        this.email = usuarioNovoRequest.getEmail();
        this.senha = usuarioNovoRequest.getSenha();
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}