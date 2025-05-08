package br.com.alura.aluno;

public class Aluno {
    private String nome;
    private double nota;

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    void calcularMedia(double nota1, double nota2){
        double media = (nota1 + nota2) / 2;
        System.out.println("Média das notas: " + media);
    }
}
