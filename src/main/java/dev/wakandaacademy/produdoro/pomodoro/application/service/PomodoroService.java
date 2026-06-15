package dev.wakandaacademy.produdoro.pomodoro.application.service;

import dev.wakandaacademy.produdoro.usuario.domain.ConfiguracaoPadrao;
import org.springframework.stereotype.Service;

@Service
public class PomodoroService implements PomodoroApplicationService {
    @Override
    public ConfiguracaoPadrao getConfiguracaoPadrao(){
        //TODO Implementar busca das configuraçoes padroes no MongoDB
        return ConfiguracaoPadrao.builder()
                .tempoMinutosFoco(25)
                .tempoMinutosPausaCurta(5)
                .tempoMinutosPausaLonga(15)
                .repeticoesParaPausaLonga(3)
                .build();
       }
}
