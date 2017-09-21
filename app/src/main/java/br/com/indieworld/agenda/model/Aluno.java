package br.com.indieworld.agenda.model;

import java.io.Serializable;

/**
 * Created by Junior on 16/09/2017.
 */

public class Aluno implements Serializable{
    private Long id;
    private String nome;
    private String edereco;
    private String telefone;
    private String site;
    private double nota;
    private String caminhoFoto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEdereco() {
        return edereco;
    }

    public void setEdereco(String edereco) {
        this.edereco = edereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCaminhoFoto() {
        return caminhoFoto;
    }

    public void setCaminhoFoto(String caminhoFoto) {
        this.caminhoFoto = caminhoFoto;
    }

    @Override
    public String toString() {
        return getId()+ "- "+getNome();
    }


}
