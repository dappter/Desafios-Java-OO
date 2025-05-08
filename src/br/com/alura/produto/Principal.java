package br.com.alura.produto;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto();

        produto1.setNome("Leite Betânea");
        produto1.setPreco(9.99);

        Produto produto2 = new Produto();

        produto2.setNome("Carne FreeBoy");
        produto2.setPreco(79.99);

        System.out.println("Produto: " + produto1.getNome() + "\nPreço: " + produto1.getPreco());
        produto1.aplicarDesconto(10);
        System.out.println();
        System.out.println("Produto: " + produto2.getNome() + "\nPreço: " + produto2.getPreco());
        produto2.aplicarDesconto(20);

        //System.out.println("Produto: " + produto2.getNome() + "\nPreço: " + produto2.getPreco());
        //produto2.aplicarDesconto(100);
        //Saída: desconto não cadastrado!
    }
}
