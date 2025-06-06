package br.com.poo.modelo.jobeeeventos;

public class Compra {

    private Evento evento;
    private int quantidade;

    public Compra(Evento evento, int quantidade) {
        this.evento = evento;
        this.quantidade = quantidade;
    }

    public Evento getEvento() {
        return evento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getValorTotal() {
        return evento.getValor() * quantidade;
    }
}
