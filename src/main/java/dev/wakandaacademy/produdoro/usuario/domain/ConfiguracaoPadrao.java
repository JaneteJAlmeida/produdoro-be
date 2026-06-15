package dev.wakandaacademy.produdoro.usuario.domain;

import lombok.Builder;

@Builder
public class ConfiguracaoPadrao {
    private int tempoMinutosFoco;
    private int tempoMinutosPausaCurta;
    private int tempoMinutosPausaLonga;
    private int repeticoesParaPausaLonga;

    public ConfiguracaoPadrao(int tempoMinutosFoco, int tempoMinutosPausaCurta, int tempoMinutosPausaLonga, int repeticoesParaPausaLonga) {
        this.tempoMinutosFoco = tempoMinutosFoco;
        this.tempoMinutosPausaCurta = tempoMinutosPausaCurta;
        this.tempoMinutosPausaLonga = tempoMinutosPausaLonga;
        this.repeticoesParaPausaLonga = repeticoesParaPausaLonga;
    }
    public int getTempoMinutosFoco() { return tempoMinutosFoco; }
    public int getTempoMinutosPausaCurta() { return tempoMinutosPausaCurta; }
    public int getTempoMinutosPausaLonga() { return tempoMinutosPausaLonga; }
    public int getRepeticoesParaPausaLonga() { return repeticoesParaPausaLonga; }
}