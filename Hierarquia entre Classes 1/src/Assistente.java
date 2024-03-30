public class Assistente extends Funcionario {
    private String name;
    private float salary;
    private int registryNumber;
    public Assistente(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
    public int getRegistryNumber() {
        return registryNumber;
    }
    public void setRegistryNumber(int registryNumber) {
        this.registryNumber = registryNumber;
    }
    public void exibeDados() {
        System.out.println("Assistente: " + this.name + " - Salário: " + this.salary + " - Ganho anual: " + ganhoAnual());
    }
}