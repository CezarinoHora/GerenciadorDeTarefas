/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciadordetarefas;

/**
 *
 * @author Cezarino Hora
 */
public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean concluida;

    // Construtor
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    // Método toString
    @Override
    public String toString() {
        return "Título: " + titulo + "\nDescrição: " + descricao + "\nConcluída: " + (concluida ? "Sim" : "Não") + "\n";
    }
}

