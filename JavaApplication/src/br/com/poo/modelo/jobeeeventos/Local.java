package br.com.poo.modelo.jobeeeventos;

public class Local {
    private String endereco;
    private int capacidade;

    public Local(String endereco, int capacidade) {
        this.endereco = endereco;
        this.capacidade = capacidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}


