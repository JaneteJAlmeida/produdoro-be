package dev.wakandaacademy.produdoro.tarefa.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusTarefa {
    A_FAZER("A fazer"),
    EM_ANDAMENTO("Em andamento"),
    CONCLUIDA("Concluída");

    StatusTarefa(String string) {
		this.descricao = "";
	}

	private final String descricao;
}
