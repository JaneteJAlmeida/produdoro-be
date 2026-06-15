package dev.wakandaacademy.produdoro.usuario.application.service;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoPadrao;
import dev.wakandaacademy.produdoro.usuario.aplication.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.aplication.api.UsuarioNovoRequest;
import dev.wakandaacademy.produdoro.usuario.aplication.api.UsuarioService;
import dev.wakandaacademy.produdoro.usuario.application.repository.UsuarioRepository;
import dev.wakandaacademy.produdoro.credencial.application.service.CredencialApplicationService;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UsuarioApplicationService implements UsuarioService {

    private static final Logger log = LoggerFactory.getLogger(UsuarioApplicationService.class);
    private final UsuarioRepository usuarioRepository;
    private final CredencialApplicationService credencialService;

    public UsuarioApplicationService(UsuarioRepository usuarioRepository, CredencialApplicationService credencialService) {
        this.usuarioRepository = usuarioRepository;
        this.credencialService = credencialService;
    }

    @Override
    public UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovoRequest) {
        log.info("[inicia] UsuarioApplicationService - criaNovoUsuario");

        var configuracaoPadrao = getConfiguracaoPadrao();

        credencialService.criaNovaCredencial(usuarioNovoRequest);

        var usuario = new Usuario(usuarioNovoRequest, configuracaoPadrao);

        usuarioRepository.salva(usuario);

        log.info("[finaliza] UsuarioApplicationService - criaNovoUsuario");
        return new UsuarioCriadoResponse(usuario.getIdUsuario(), usuario.getEmail());
    }
    private ConfiguracaoPadrao getConfiguracaoPadrao() {
        ConfiguracaoPadrao configuracaoPadrao = new ConfiguracaoPadrao(25, 5, 15, 3);
        return configuracaoPadrao;
    }
}