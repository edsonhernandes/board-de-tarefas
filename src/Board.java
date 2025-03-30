import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
    private List<Tarefa> tarefas;

    // Construtor
    public Board() {
        this.tarefas = new ArrayList<>();
    }

    // Método para adicionar uma nova tarefa
    public void adicionarTarefa(String titulo) {
        Tarefa novaTarefa = new Tarefa(titulo);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    // Método para listar todas as tarefas
    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa no board.");
        } else {
            System.out.println("Tarefas no Board:");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    // Método para marcar uma tarefa como concluída
    public void concluirTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.get(index).marcarComoConcluida();
            System.out.println("Tarefa marcada como concluída.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    // Método para excluir uma tarefa
    public void excluirTarefa(int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
            System.out.println("Tarefa excluída.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }
}
