package dev.wakandaacademy.produdoro.usuario.domain;

public class ConfiguracaoPadrao {

    private int tempoMinutosFoco;
    private int tempoMinutosPausaCurta;
    private int tempoMinutosPausaLonga;
    private int repeticoesParaPausaLonga;

    public ConfiguracaoPadrao() {
    }

    public ConfiguracaoPadrao(int tempoMinutosFoco, int tempoMinutosPausaCurta, int tempoMinutosPausaLonga, int repeticoesParaPausaLonga) {
        this.tempoMinutosFoco = tempoMinutosFoco;
        this.tempoMinutosPausaCurta = tempoMinutosPausaCurta;
        this.tempoMinutosPausaLonga = tempoMinutosPausaLonga;
        this.repeticoesParaPausaLonga = repeticoesParaPausaLonga;
    }

    public static ConfiguracaoPadraoBuilder builder() {
        return new ConfiguracaoPadraoBuilder();
    }

    public static class ConfiguracaoPadraoBuilder {
        private int tempoMinutosFoco;
        private int tempoMinutosPausaCurta;
        private int tempoMinutosPausaLonga;
        private int repeticoesParaPausaLonga;

        public ConfiguracaoPadraoBuilder tempoMinutosFoco(int tempoMinutosFoco) {
            this.tempoMinutosFoco = tempoMinutosFoco;
            return this;
        }
        public ConfiguracaoPadraoBuilder tempoMinutosPausaCurta(int tempoMinutosPausaCurta) {
            this.tempoMinutosPausaCurta = tempoMinutosPausaCurta;
            return this;
        }
        public ConfiguracaoPadraoBuilder tempoMinutosPausaLonga(int tempoMinutosPausaLonga) {
            this.tempoMinutosPausaLonga = tempoMinutosPausaLonga;
            return this;
        }
        public ConfiguracaoPadraoBuilder repeticoesParaPausaLonga(int repeticoesParaPausaLonga) {
            this.repeticoesParaPausaLonga = repeticoesParaPausaLonga;
            return this;
        }
        public ConfiguracaoPadrao build() {
            return new ConfiguracaoPadrao(tempoMinutosFoco, tempoMinutosPausaCurta, tempoMinutosPausaLonga, repeticoesParaPausaLonga);
        }
    }

    public int getTempoMinutosFoco() { return tempoMinutosFoco; }
    public int getTempoMinutosPausaCurta() { return tempoMinutosPausaCurta; }
    public int getTempoMinutosPausaLonga() { return tempoMinutosPausaLonga; }
    public int getRepeticoesParaPausaLonga() { return repeticoesParaPausaLonga; }
}