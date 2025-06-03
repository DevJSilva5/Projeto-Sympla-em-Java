package br.com.poo.modelo;
import br.com.poo.modelo.jobeeeventos.Evento;
import br.com.poo.modelo.jobeeeventos.Data;
import br.com.poo.modelo.jobeeeventos.Local;
import br.com.poo.modelo.jobeeeventos.Ingressso;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
    String opcao=null;
    String escolha=null;
                
        Evento evento1 = new Evento(1, "Corrida da Barra", new Data(3,5,2006,"23:00","24:00"), "mega corrida de 10km na barra com direito a medalha de primeiro, segundo e terceiro lugar.", 15.0f, 10, new Local("RUA 1", 100));
        Evento evento2 = new Evento(2, "Corrida do ovo", new Data(5,7,2025,"21:00","23:00"), "Corrida do ovo", 15.0f, 122, new Local("RUA 6", 100));
        Evento evento3 = new Evento(3, "Corrida do ovo", new Data(5,8,2025,"21:00","23:00"), "Corrida do ovo", 15.0f, 12, new Local("RUA 4", 100));
        
        JOptionPane.showMessageDialog(null, "Olá! Bem-vindo à Jobee Eventos!");
        opcao = JOptionPane.showInputDialog("Esses são os eventos disponiveis:" +"\n1- "+evento1.getNome()+"\n2- "+evento2.getNome()+"\n3- "+evento3.getNome());
        escolha = JOptionPane.showInputDialog(null, evento1);
        
    }
    
}