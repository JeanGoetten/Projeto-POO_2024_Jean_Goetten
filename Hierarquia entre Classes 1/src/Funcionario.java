public class Funcionario {
    private String name;
    private float salary;

    public Funcionario(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public float getSalary() {
        return salary;
    }
    public void addAumento(float valor){
        this.salary = this.salary + valor;
    }
    public float ganhoAnual(){
        return this.salary * 12;
    }
    public void exibeDados(){
        System.out.println("Funcionário: " + this.name + " - Salário: " + this.salary + " - Ganho anual: " + ganhoAnual());
    }
}
