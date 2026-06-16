package dev.wakandaacademy.produdoro.usuario.aplication.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/usuario")
public class UsuarioController implements UsuarioAPI {

    private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public UsuarioCriadoResponse postNovoUsuario(UsuarioNovoRequest usuarioNovoRequest) {
        log.info("[inicia] UsuarioController - postNovoUsuario");
        UsuarioCriadoResponse usuarioCriado = usuarioService.criaNovoUsuario(usuarioNovoRequest);
        log.info("[finaliza] UsuarioController - postNovoUsuario");
        return usuarioCriado;
    }
}