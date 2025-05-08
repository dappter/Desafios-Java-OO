package br.com.alura.aluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        aluno1.setNome("João");

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Essa é a média do aluno " + aluno1.getNome());
        aluno1.calcularMedia(nota1, nota2);

    }
}
