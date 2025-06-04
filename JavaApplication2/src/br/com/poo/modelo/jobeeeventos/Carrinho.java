package br.com.poo.modelo.jobeeeventos;


public class Carrinho {
    
    private float valorTotal;
    private int quantidadeIngressos;
    private Ingresso ingresso;

    public Carrinho(float valorTotal, int quantidadeIngressos, Ingresso ingresso) {
        this.valorTotal = valorTotal;
        this.quantidadeIngressos = quantidadeIngressos;
        this.ingresso = ingresso;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidadeIngressos() {
        return quantidadeIngressos;
    }

    public void setQuantidadeIngressos(int quantidadeIngressos) {
        if (quantidadeIngressos > ingresso.getQuantidadeTotal()) {
            System.out.println("Erro: quantidade de ingressos no carrinho excede o total disponível.");
        } else {
            this.quantidadeIngressos = quantidadeIngressos;
            this.valorTotal = (float) (quantidadeIngressos * ingresso.getValorIngresso());
        }
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingresso = ingresso;
    }
}
