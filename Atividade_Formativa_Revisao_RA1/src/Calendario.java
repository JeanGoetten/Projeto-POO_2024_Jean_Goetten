//10. Classe Calendário: Crie uma classe Calendário que represente uma data (dia, mês, ano).
//Implemente métodos para exibir a data no formato dd/mm/aaaa e para verificar se o ano é
//bissexto.

import java.util.*;
public class Calendario {
    private int dia;
    private int mes;
    private int ano;
    GregorianCalendar gc = new GregorianCalendar();
    public Calendario() {
        this.dia = gc.get(Calendar.DAY_OF_MONTH);
        this.mes = gc.get(Calendar.MONTH);
        this.ano = gc.get(Calendar.YEAR);
    }
    public boolean isBissexto(int ano){
        if(gc.isLeapYear(ano)){
            return true;
        }else{
            return false;
        }
    }
}