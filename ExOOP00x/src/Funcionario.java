public class Funcionario {

    private String nome;
    private double salarioBase;

    public Funcionario(){

    }

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalarioFinal(){
        return 0;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioFinal=" + calcularSalarioFinal() +
                '}';
    }
}
