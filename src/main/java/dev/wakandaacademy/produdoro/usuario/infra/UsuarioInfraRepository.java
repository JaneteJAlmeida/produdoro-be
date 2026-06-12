package dev.wakandaacademy.produdoro.usuario.infra;

import dev.wakandaacademy.produdoro.usuario.application.repository.UsuarioRepository;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioInfraRepository implements UsuarioRepository {

    private static final Logger log = LoggerFactory.getLogger(UsuarioInfraRepository.class);
    private final UsuarioMongoSpringRepository usuarioMongoSpringRepository;

    public UsuarioInfraRepository(UsuarioMongoSpringRepository usuarioMongoSpringRepository) {
        this.usuarioMongoSpringRepository = usuarioMongoSpringRepository;
    }
    @Override
    public Usuario salva(Usuario usuario) {
        log.info("[inicia] UsuarioInfraRepository - salva");
        usuarioMongoSpringRepository.save(usuario);
        log.info("[finaliza] UsuarioInfraRepository - salva");
        return usuario;
    }
}