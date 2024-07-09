package main.java.list;
import java.util.*;
class ListaTarefa {

    private List<Tarefa> tarefaList;

    //List<Tarefa> lista = new List<Tarefa>();


    public ListaTarefa() {
        this.tarefaList = new ArrayList();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> listaParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                listaParaRemover.add(t);
            }
            tarefaList.removeAll(listaParaRemover);
        }
    }

    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }


}