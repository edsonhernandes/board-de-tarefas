import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new Board();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Listar Tarefas");
            System.out.println("3. Concluir Tarefa");
            System.out.println("4. Excluir Tarefa");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    board.adicionarTarefa(titulo);
                    break;
                case 2:
                    board.listarTarefas();
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa para concluir: ");
                    int tarefaConcluir = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer
                    board.concluirTarefa(tarefaConcluir - 1);
                    break;
                case 4:
                    System.out.print("Digite o número da tarefa para excluir: ");
                    int tarefaExcluir = scanner.nextInt();
                    scanner.nextLine();  // Limpar o buffer
                    board.excluirTarefa(tarefaExcluir - 1);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
