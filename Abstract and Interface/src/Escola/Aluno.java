package Escola;

import java.util.ArrayList;

public class Aluno {
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }
    public void showDisciplinas(){
        for(Disciplina disciplina : disciplinas){
            System.out.println(disciplina.getNome());
        }
    }
}
