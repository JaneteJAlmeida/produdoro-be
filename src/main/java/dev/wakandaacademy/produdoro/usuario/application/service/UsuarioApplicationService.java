package dev.wakandaacademy.produdoro.usuario.application.service;

import dev.wakandaacademy.produdoro.usuario.aplication.api.UsuarioCriadoResponse;
import dev.wakandaacademy.produdoro.usuario.aplication.api.UsuarioNovoRequest;
import dev.wakandaacademy.produdoro.usuario.aplication.api.UsuarioService;
import dev.wakandaacademy.produdoro.usuario.application.repository.UsuarioRepository;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UsuarioApplicationService implements UsuarioService {

    private static final Logger log = LoggerFactory.getLogger(UsuarioApplicationService.class);
    private final UsuarioRepository usuarioRepository;

    public UsuarioApplicationService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UsuarioCriadoResponse criaNovoUsuario(UsuarioNovoRequest usuarioNovoRequest) {
        log.info("[inicia] UsuarioApplicationService - criaNovoUsuario");
        Usuario usuario = new Usuario(usuarioNovoRequest);
        usuarioRepository.salva(usuario); // Salvando no banco de dados!
        log.info("[finaliza] UsuarioApplicationService - criaNovoUsuario");
        return new UsuarioCriadoResponse(usuario.getIdUsuario(), usuario.getEmail());
    }
}