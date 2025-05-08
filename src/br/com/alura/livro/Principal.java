package br.com.alura.livro;


public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.setTitulo("Dias Perfeitos");
        livro1.setAutor("Raphael Montes");
        livro1.exibirDetalhes();

        Livro livro2 = new Livro();

        System.out.println();
        livro2.setTitulo("Suicidas");
        livro2.setAutor("Raphael Montes");
        livro2.exibirDetalhes();

        Livro livro3 = new Livro();

        System.out.println();
        livro3.setTitulo("Lógica de Programação");
        livro3.setAutor("Paulo Silveira");
        livro3.exibirDetalhes();
    }
}
