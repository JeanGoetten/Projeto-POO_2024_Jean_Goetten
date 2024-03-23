//9. Classe Funcionário: Crie uma classe Funcionário com atributos como nome, cargo e
//salário. Implemente um método para calcular o aumento de salário com base em uma
//porcentagem dada.

public class Funcionario {
    private String nome;
    private String cargo;
    private float salario;
    public Funcionario(String nome, String cargo, float salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aumento(float porcentagemAumento){
        this.salario += this.salario*(porcentagemAumento/100);
    }
}