package br.com.alura.idadepessoa;

public class Principal {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("João");
        pessoa1.setIdade(28);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Júlia");
        pessoa2.setIdade(16);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        pessoa1.verificarIdade();
        System.out.println();
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
        pessoa2.verificarIdade();
    }
}
