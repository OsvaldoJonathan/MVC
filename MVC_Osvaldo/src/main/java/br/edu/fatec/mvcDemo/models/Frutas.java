package br.edu.fatec.mvcDemo.models;

public class Frutas {
    private String nome;
    private String cor;
    private float preco;

    public Frutas(String nome, String cor, float preco) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
