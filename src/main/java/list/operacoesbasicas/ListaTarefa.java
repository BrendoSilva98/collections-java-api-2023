package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //attribute
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Total number of elements on the list is: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Task 1");
        listaTarefa.adicionarTarefa("Task 1");
        listaTarefa.adicionarTarefa("Task 2");
        System.out.println("Total number of elements on the list is: " + listaTarefa.obterNumeroTotalTarefas());

        //listaTarefa.removerTarefa("Task 2");
        System.out.println("Total number of elements on the list is: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }
}
