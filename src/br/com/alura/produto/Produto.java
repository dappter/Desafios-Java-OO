package br.com.alura.produto;

public class Produto {
    private String nome;
    private double preco;
    private int desconto;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getDesconto() {
        return desconto;
    }



    public void aplicarDesconto(int descontoPercentual){
        if (descontoPercentual == 10) {
            double desconto = preco * (10.0 / 100);
            preco -= desconto;
            System.out.println("Preço final: " +preco);
        } else if (descontoPercentual == 20) {
            double desconto = preco * (20.0 / 100);
            preco -= desconto;
            System.out.println("Preço final: " + preco);
        }
        else {
            System.out.println("Desconto não cadastrado!");
        }
    }
}
