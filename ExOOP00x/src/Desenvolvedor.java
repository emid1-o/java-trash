public class Desenvolvedor extends Funcionario{

    private int numeroProjetos;
    private double bonusPorProjeto;

    public Desenvolvedor(String nome, double salarioBase, double bonusPorProjeto, int numeroProjetos) {
        super(nome, salarioBase);
        this.bonusPorProjeto = bonusPorProjeto;
        this.numeroProjetos = numeroProjetos;
    }

    @Override
    public double calcularSalarioFinal() {
        return super.getSalarioBase() + (numeroProjetos * bonusPorProjeto);
    }
}
