package br.edu.unis.listadetarefas.model;

import java.util.ArrayList;

public class Tarefa {

    private String titulo;
    private String descricao;

    public Tarefa(String titulo,String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }



    /**
     * @todo Voltar ao normal após modificar o adapter
     * @return String titulo da tarefa
     */
    public String toString() {
      return this.titulo.concat("(").concat(descricao).concat(")");
    }





}
