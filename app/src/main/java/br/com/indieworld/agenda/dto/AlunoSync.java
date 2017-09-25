package br.com.indieworld.agenda.dto;

import java.util.List;

import br.com.indieworld.agenda.model.Aluno;

/**
 * Created by Junior on 24/09/2017.
 */

public class AlunoSync {

    private List<Aluno> alunos;
    private String momentoDaUltimaModificacao;

    public String getMomentoDaUltimaModificacao() {
        return momentoDaUltimaModificacao;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
