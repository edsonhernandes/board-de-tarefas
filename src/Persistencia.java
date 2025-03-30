import java.io.*;
import java.util.*;

public class Persistencia {
    private static final String ARQUIVO_TAREFAS = "tarefas.txt";

    // Carregar tarefas do arquivo
    public static List<Tarefa> carregarTarefas() {
        List<Tarefa> tarefas = new ArrayList<>();
        File arquivo = new File(ARQUIVO_TAREFAS);

        if (arquivo.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split("\\|");
                    if (dados.length == 2) {
                        String titulo = dados[0];
                        boolean concluida = Boolean.parseBoolean(dados[1]);
                        tarefas.add(new Tarefa(titulo, concluida));
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo de tarefas: " + e.getMessage());
            }
        }

        return tarefas;
    }

    // Salvar tarefas no arquivo
    public static void salvarTarefas(List<Tarefa> tarefas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO_TAREFAS))) {
            for (Tarefa tarefa : tarefas) {
                bw.write(tarefa.getTitulo() + "|" + tarefa.isConcluida());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar as tarefas no arquivo: " + e.getMessage());
        }
    }
}

