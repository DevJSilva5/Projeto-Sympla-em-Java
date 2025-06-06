package br.com.poo.modelo;

import br.com.poo.modelo.jobeeeventos.Compra;
import br.com.poo.modelo.jobeeeventos.Evento;
import br.com.poo.modelo.jobeeeventos.Data;
import br.com.poo.modelo.jobeeeventos.Local;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Main {

    public static void main(String[] args) {

        ArrayList<Evento> listaEventos = new ArrayList<>();
        ArrayList<Compra> carrinho = new ArrayList<>();
        int qtdIngressos = 0;
        float valorTotal = 0;
        
        ImageIcon icon = new ImageIcon("src\\img\\symplalogo.png");
        JOptionPane.showMessageDialog(null, "SEJA BEM VINDO(A) A JOBEE EVENTOS!!", "BOAS VINDAS",JOptionPane.INFORMATION_MESSAGE ,icon);
                
        for (int j = 0; j <= 3; j++) {

            int maiorNumeroEventos = listaEventos.size();

            String menu = JOptionPane.showInputDialog(null, " 1. VER EVENTOS\n 2. ADCIONAR EVENTO\n 3. VER CARRINHO \n\n 4. SAIR", null);
            int escolhaMenu = Integer.parseInt(menu);

            if (escolhaMenu == 1) {

                StringBuilder eventosDisponiveis = new StringBuilder("Esses são os eventos disponíveis:\n" + "0. VOLTAR\n\n");
                for (int i = 0; i < listaEventos.size(); i++) {
                    eventosDisponiveis.append(i + 1).append(". ").append(listaEventos.get(i).getNome()).append("\n");
                }

                String escolha = JOptionPane.showInputDialog(null, eventosDisponiveis.toString() + "\nEscolha um evento:");
                int escolhaNumero = Integer.parseInt(escolha);

                if (escolhaNumero < 0 || escolhaNumero > listaEventos.size()) {
                    JOptionPane.showMessageDialog(null, "Evento não existe");
                } else if (escolhaNumero == 0) {

                } else {

                    Evento eventoEscolhido = listaEventos.get(escolhaNumero - 1);

                    String voltar = JOptionPane.showInputDialog(null, "Você escolheu:\n" + eventoEscolhido + "0. Voltar\n1. Confirmar\n ");

                    int escolhaVoltar = Integer.parseInt(voltar);
                    if (escolhaVoltar == 0) {

                    } else if (escolhaVoltar == 1) {

                        String qtdStr = JOptionPane.showInputDialog(null, "Digite quantos ingressos deseja comprar:");
                        qtdIngressos = Integer.parseInt(qtdStr);

                        int ingressosDisponiveis = eventoEscolhido.getIngressosDisponiveis();

                        if (qtdIngressos <= ingressosDisponiveis) {
                            eventoEscolhido.setIngressosVendidos(eventoEscolhido.getIngressosVendidos() + qtdIngressos);

                            Compra novaCompra = new Compra(eventoEscolhido, qtdIngressos);
                            carrinho.add(novaCompra);

                            JOptionPane.showMessageDialog(null, "Ingressos adicionados ao carrinho!\n"
                                    + "Evento: " + eventoEscolhido.getNome()
                                    + "\nQuantidade: " + qtdIngressos
                                    + "\nValor total: R$ " + novaCompra.getValorTotal()
                                    + "\nIngressos restantes: " + eventoEscolhido.getIngressosDisponiveis());

                        } else {
                            JOptionPane.showMessageDialog(null, "Desculpe, não há ingressos suficientes.\nIngressos disponíveis: " + ingressosDisponiveis);

                        }
                    }
                }

            } else if (escolhaMenu == 2) {

                JOptionPane.showMessageDialog(null, "Você escolheu Adicionar eventos\nDigite as informaçoes solicitadas");

                String nome = JOptionPane.showInputDialog("Nome do Evento:");
                String descricao = JOptionPane.showInputDialog("Descrição do Evento:");

                int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia do Evento:"));
                if (dia > 31 || dia <= 0) {
                    JOptionPane.showMessageDialog(null, "Dia invalido");
                } else {

                    int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês do Evento:"));
                    if (mes > 12 || mes <= 0) {
                        JOptionPane.showMessageDialog(null, "Mes invalido");
                    }else{

                    int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do Evento:"));
                    if (ano < 2025 || ano > 2100) {
                        JOptionPane.showMessageDialog(null, "Ano invalido");
                    }else{

                    String horarioInicio = JOptionPane.showInputDialog("Horário de Inicio:");
                    String horarioFim = JOptionPane.showInputDialog("Horário de Fim:");

                    float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor do Ingresso:"));
                    if (valor <= 0) {
                        JOptionPane.showMessageDialog(null, "O valor do ingresso deve ser maior que zero.");
                       
                    }else{

                    String nomeLocal = JOptionPane.showInputDialog("Nome do Local:");
                    int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Capacidade de público:"));

                    Data dataEvento = new Data(dia, mes, ano, horarioInicio, horarioFim);
                    Local localEvento = new Local(nomeLocal, capacidade);

                    int novoId = listaEventos.size() + 1;

                    Evento novoEvento = Evento.criarEvento(novoId, nome, dataEvento, descricao, valor, localEvento);

                    listaEventos.add(novoEvento);
                    JOptionPane.showMessageDialog(null, "Evento adicionado com sucesso!");
                }
                    }
                    }
                    }
                

            } else if (escolhaMenu == 3) {
                if (carrinho.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Seu carrinho está vazio.");
                } else {
                    StringBuilder carrinhoTexto = new StringBuilder("Itens no carrinho:\n\n");
                    float valorFinal = 0;

                    for (Compra compra : carrinho) {
                        carrinhoTexto.append("Evento: ").append(compra.getEvento().getNome())
                                .append("\nQuantidade: ").append(compra.getQuantidade())
                                .append("\nTotal: R$ ").append(compra.getValorTotal())
                                .append("\n\n");
                        valorFinal += compra.getValorTotal();
                    }

                    carrinhoTexto.append("Valor total da compra: R$ ").append(valorFinal);
                    JOptionPane.showMessageDialog(null, carrinhoTexto.toString());

                }

            } else if (escolhaMenu == 4) {
                JOptionPane.showMessageDialog(null, "Fechando aplicativo...");
                break;

            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente.");
            }
            j = 1;
        }
    }
}