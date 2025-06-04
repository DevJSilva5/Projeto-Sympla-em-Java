package br.com.poo.modelo;
import br.com.poo.modelo.jobeeeventos.Evento;
import br.com.poo.modelo.jobeeeventos.Data;
import br.com.poo.modelo.jobeeeventos.Local;
import br.com.poo.modelo.jobeeeventos.Ingresso;
import br.com.poo.modelo.jobeeeventos.Carrinho;
import br.com.poo.modelo.view.Janela;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
    
    String escolha;
    int escolhaNumero;
    
        ArrayList<Evento> listaEventos = new ArrayList<>();
        
        Evento evento1 = new Evento(1, "1-Corrida da Barra", new Data(3,5,2006,"23:00","24:00"), "mega corrida de 10km na barra com direito a medalha de primeiro, segundo e terceiro lugar.", 15.0f, 10, new Local("na barra", 100));
        Evento evento2 = new Evento(2, "2-Show do naldobenny", new Data(5,7,2025,"21:00","23:00"), "show do benny presidente da champions", 15.0f, 122, new Local("Rua da verdade", 400));
        Evento evento3 = new Evento(3, "3-pilates ao ar livre", new Data(5,8,2025,"21:00","23:00"), "pilates para senhoras de 100 anos", 15.0f, 12, new Local("floresta", 100));
        
        listaEventos.add(null);
        listaEventos.add(evento1);
        listaEventos.add(evento2);
        listaEventos.add(evento3);
        
        Janela Janela = new Janela();
        
        
        
        JLabel label= new JLabel("Bem vindo a JobeeEventos\n\n");
        label.setBounds(50,20,200,30);
       
        
        JOptionPane.showMessageDialog(null,"Esses são os eventos disponiveis: \n\n"+listaEventos);
        escolha=JOptionPane.showInputDialog(null);
        escolhaNumero = Integer.parseInt(escolha);
 
       JOptionPane.showInputDialog(null, listaEventos.get(escolhaNumero) + "digite quantos ingressos deseja:");
     
        
        
        
    }
    
}