package br.com.poo.modelo.jobeeeventos;
import br.com.poo.modelo.jobeeeventos.Evento;
import br.com.poo.modelo.jobeeeventos.Carrinho;
        
public class Ingresso {
    
    private int quantidadeTotal;
    private double valorIngresso;
    

    public Ingresso(int quantidadeTotal, double valorIngresso) {
        this.quantidadeTotal = quantidadeTotal;
        this.valorIngresso = valorIngresso;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

 
}
