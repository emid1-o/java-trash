public class Main {

    public static void main(String[] args) {

        Gerente emidio = new Gerente("emidio", 1800, 500);
        System.out.println(emidio);
        System.out.println("Salario final = " + emidio.calcularSalarioFinal());

        Desenvolvedor carlos = new Desenvolvedor("Carlos", 3000, 700, 10);
        System.out.println(carlos);
        System.out.println("Salario final = " + carlos.calcularSalarioFinal());
    }
}
