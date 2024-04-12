package Casa;

import java.util.ArrayList;

public class Casa {
    private ArrayList<Quarto> quartos = new ArrayList<>();
    private int qtdQuartos;

    public void addQuarto(Quarto quarto){
        quartos.add(quarto);
    }

    public void qtdQuartos(){
        for(Quarto quarto : quartos){
            qtdQuartos++;
        }
        System.out.println(qtdQuartos + " quartos");
    }
}
