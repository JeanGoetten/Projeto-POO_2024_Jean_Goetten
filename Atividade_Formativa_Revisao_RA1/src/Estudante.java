//4. Classe Estudante: Crie uma classe Estudante com atributos como nome, matrícula e
//notas. Implemente um método para calcular a média das notas.

import java.util.ArrayList;

public class Estudante {
    private String nome;
    private int matricula;
    private ArrayList<Float> notas = new ArrayList<Float>();

    public Estudante() {// cria uma matrícula sem nome
        this.matricula++;
    }
    public Estudante(String nome) { // permite passar o nome durante a matrícula
        this.nome = nome;
        this.matricula++;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNotas(float nota) {
        this.notas.add(nota);
    }
    public float media(){
        float media = 0;
        for(int i = 0; i < notas.size(); i++){
            media += notas.get(i);
        }
        return media/notas.size();
    }
}
