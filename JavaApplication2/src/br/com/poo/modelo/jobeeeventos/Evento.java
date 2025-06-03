package br.com.poo.modelo.jobeeeventos;
import br.com.poo.modelo.jobeeeventos.Data;
import br.com.poo.modelo.jobeeeventos.Local;
import br.com.poo.modelo.jobeeeventos.Ingressso;


public class Evento {
    
    private int id;
    private String nome;
    private Data data;
    private String descricao;
    private float valor;
    private int ingressosVendidos;
    private Local local;

    public Evento(int id, String nome, Data data, String descricao, float valor, int ingressosVendidos, Local local) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.ingressosVendidos = ingressosVendidos;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(int ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    

    @Override
    public String toString(){
        return "==============================\n" +
               "Nome: " + nome + "\n" +
               "Descrição: \n\n" + descricao + "\n\n" +
               "Data: " + data.getDia() + "/" + data.getMes() + "/" + data.getAno() + "\n" +
               "Horário: Início - " + data.getHoraIni() + " | Fim - " + data.getHoraFim() + "\n" +
               "Local: " + local.getEndereco() + "\n" +
               "Capacidade: " + local.getCapacidade() + " pessoas\n" +
               "Valor do Ingresso: R$ " + valor + "\n" +
               "Ingressos Vendidos: " + ingressosVendidos + "\n" +
               "==============================";
    }
    
}