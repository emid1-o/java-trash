public class Gerente extends Funcionario{

    private double bonusFixo;

    public Gerente(String nome, double salarioBase, double bonusFixo) {
        super(nome, salarioBase);
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalarioFinal() {
        return super.getSalarioBase() + bonusFixo;
    }
}
