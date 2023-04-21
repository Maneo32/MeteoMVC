package View;

import Model.Meteo;

public class Widget {
    public void afficher(Meteo m){
        System.out.println(m.getTaux()+" "+m.getTemp()+" "+m.getVent()+" Wid");
    }
}
