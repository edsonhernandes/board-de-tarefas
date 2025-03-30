public class Tarefa {
    private String titulo;
    private boolean concluida;

    // Construtor
    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.concluida = false; // Por padrão, a tarefa não está concluída
    }

    // Construtor adicional para ler do arquivo
    public Tarefa(String titulo, boolean concluida) {
        this.titulo = titulo;
        this.concluida = concluida;
    }

    // Getter e Setter para o título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter e Setter para a tarefa concluída
    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    public void desmarcarComoConcluida() {
        this.concluida = false;
    }

    @Override
    public String toString() {
        return titulo + (concluida ? " (Concluída)" : " (Pendente)");
    }
}
