package dev.wakandaacademy.produdoro.usuario.aplication.api;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UsuarioNovoRequest {

    @NotBlank(message = "O e-mail não pode estar em branco")
    @Email(message = "E-mail inválido")
    private String email;

    @NotBlank(message = "A senha não pode estar em branco")
    @Size(min = 6, message = "A senha deve ter no mínimo 6 caracteres")
    private String senha;

    public UsuarioNovoRequest() {
    }

    public UsuarioNovoRequest(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}