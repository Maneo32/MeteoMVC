package Controller;

import Model.Meteo;
import View.Widget;
import View2.Navigateur;

public class Controller {
    private Navigateur nav = new Navigateur();
    private Widget wid = new Widget();


    public void setData(Meteo m){
        nav.afficher(m);
        wid.afficher(m);
    }
}
