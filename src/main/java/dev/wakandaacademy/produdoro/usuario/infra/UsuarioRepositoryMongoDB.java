package dev.wakandaacademy.produdoro.usuario.infra;

import dev.wakandaacademy.produdoro.usuario.application.repository.UsuarioRepository;
import dev.wakandaacademy.produdoro.usuario.domain.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioRepositoryMongoDB implements UsuarioRepository {

    private final UsuarioMongoSpringRepository usuarioMongoRepository;

    public UsuarioRepositoryMongoDB(UsuarioMongoSpringRepository usuarioMongoRepository) {
        this.usuarioMongoRepository = usuarioMongoRepository;
    }

    @Override
    public Usuario salva(Usuario usuario) {
        this.usuarioMongoRepository.save(usuario);
        return usuario;
    }
}
