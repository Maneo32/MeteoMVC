package View2;

import Model.Meteo;

public class Navigateur {

    public void afficher(Meteo m){
        System.out.println(m.getTaux()+" "+m.getTemp()+" "+m.getVent()+" Nav");
    }
}
