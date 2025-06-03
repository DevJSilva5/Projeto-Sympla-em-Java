package br.com.poo.modelo.jobeeeventos;

public class Data {
   private int dia;
   private int mes;
   private int ano;
   private String horaIni;
   private String horaFim;

    public Data(int dia, int mes, int ano, String horaIni, String horaFim) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.horaIni = horaIni;
        this.horaFim = horaFim;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getHoraIni() {
        return horaIni;
    }

    public void setHoraIni(String horaIni) {
        this.horaIni = horaIni;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

   

}
