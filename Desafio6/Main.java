package Intermediario.Desafio6;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean stop = false;
        Scanner scanner = new Scanner(System.in);

        LinkedList<Ninja> ninjas = new LinkedList<>();
        Ninja sasuke = new Ninja("Sasuke", 17, "Aldeia da folha");
        Ninja naruto = new Ninja("Naruto", 17, "Aldeia da Folha");
        Ninja sakura = new Ninja("Sakura", 17, "Aldeia da Folha");
        Ninja kakashi = new Ninja("Kakashi", 30, "Aldeia da Folha");
        Ninja itachi = new Ninja("Itachi", 21, "Aldeia da Névoa");
        Ninja gaara = new Ninja("Gaara", 18, "Aldeia da Areia");
        Ninja rockLee = new Ninja("Rock Lee", 17, "Aldeia da Folha");
        ninjas.add(sasuke);
        ninjas.add(naruto);
        ninjas.add(sakura);
        ninjas.add(kakashi);
        ninjas.add(itachi);
        ninjas.add(gaara);
        ninjas.add(rockLee);

        while (!stop){
            System.out.println("=== SISTEMA DE NINJAS ===");
            System.out.println("Bem vindo ao sistema de ninjas \n " +
                    "(1) Digite 1 para remover o primeiro ninja \n " +
                    "(2) Digite 2 para adicionar novo ninja no inicio \n " +
                    "(3) Para exibir lista completa de ninjas \n " +
                    "(4) Para acessar um ninja em posição especifica \n " +
                    "(5) Digite 5 para sair do sistema");

            System.out.print("Digite aqui: ");
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            switch (userChoice){
                case 1 -> ninjas.poll();
                case 2 -> {
                    System.out.print("Nome do ninja que deseja adicionar: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade do ninja: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Aldeia do ninja: ");
                    String aldeia = scanner.nextLine();
                    Ninja novoNinja = new Ninja(nome, idade, aldeia);
                    ninjas.addFirst(novoNinja);
                    System.out.println("Ninja " + ninjas.peekFirst().getNome() + " adicionado!");
                }
                case 3 -> {for (Ninja ninja : ninjas){
                    System.out.println(ninja);
                }}
                case 4 -> {
                    System.out.print("Qual a posição do ninja que você quer acessar: ");
                    int posicaoNinja = scanner.nextInt();
                    System.out.println(ninjas.get(posicaoNinja));
                }
                default -> stop = true;
            }

        }

    }
}
