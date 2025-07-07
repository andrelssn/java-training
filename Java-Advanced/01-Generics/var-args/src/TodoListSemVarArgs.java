import java.util.ArrayList;
import java.util.List;

class TodoListSVA {
    List<String> todoList = new ArrayList<>();

    // Método para adicionar uma tarefa
    public void adicionarTarefas(String... tarefas) { // ... significa var args, que vai suportar um numero de variavel de tarefas
        for (String tarefa : tarefas) {
            todoList.add(tarefa);
        }
    }
}

public class TodoListSemVarArgs {
    public static void main(String[] args) {
        TodoListSVA exemplo = new TodoListSVA();

        exemplo.adicionarTarefas("Estudar Java");
        exemplo.adicionarTarefas("Estudar Java", "Tomar Café");
        exemplo.adicionarTarefas(new String[] { "Ler livro", "Fazer exercícios" });
    }
}