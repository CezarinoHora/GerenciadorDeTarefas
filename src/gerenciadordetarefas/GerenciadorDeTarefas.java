/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gerenciadordetarefas;

/**
 *
 * @author Cezarino Hora
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorDeTarefas {

    private List<Tarefa> tarefas;

    // Construtor
    public GerenciadorDeTarefas() {
        tarefas = new ArrayList<>();
    }

    // Método para adicionar uma nova tarefa
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    // Método para remover uma tarefa pelo título
    public void removerTarefa(String titulo) {
        tarefas.removeIf(tarefa -> tarefa.getTitulo().equals(titulo));
        System.out.println("Tarefa removida com sucesso!");
    }

    // Método para marcar uma tarefa como concluída
    public void marcarComoConcluida(String titulo) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getTitulo().equals(titulo)) {
                tarefa.setConcluida(true);
                System.out.println("Tarefa marcada como concluída!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    // Método para listar todas as tarefas
    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    // Método main para testar o sistema
    public static void main(String[] args) {
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("===============================================");
            System.out.println("MENU");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Marcar Tarefa como Concluída");
            System.out.println("4 - Remover Tarefa");
            System.out.println("5 - Sair");
            System.out.println("===============================================");
            
            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a opção

            switch (option) {
                case 1:
                    // Adicionar tarefa
                    System.out.println("Digite o título da tarefa:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite a descrição da tarefa:");
                    String descricao = scanner.nextLine();
                    Tarefa novaTarefa = new Tarefa(titulo, descricao);
                    gerenciador.adicionarTarefa(novaTarefa);
                    break;

                case 2:
                    // Listar tarefas
                    System.out.println("Lista de Tarefas:");
                    gerenciador.listarTarefas();
                    break;

                case 3:
                    // Marcar tarefa como concluída
                    System.out.println("Digite o título da tarefa para marcar como concluída:");
                    String tituloConcluida = scanner.nextLine();
                    gerenciador.marcarComoConcluida(tituloConcluida);
                    break;

                case 4:
                    // Remover tarefa
                    System.out.println("Digite o título da tarefa para remover:");
                    String tituloRemover = scanner.nextLine();
                    gerenciador.removerTarefa(tituloRemover);
                    break;

                case 5:
                    // Sair
                    loop = false;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
