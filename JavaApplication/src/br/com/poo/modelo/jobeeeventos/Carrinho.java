package br.com.poo.modelo.jobeeeventos;

public class Carrinho {

    private float valorTotal;

    public Carrinho() {
        this.valorTotal = 0.0f;
    }

    public void adicionarCompra(float valor) {
        this.valorTotal += valor;
    }

    public float getValorTotal() {
        return valorTotal;
    }
}
