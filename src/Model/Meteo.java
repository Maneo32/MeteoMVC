package Model;

import Controller.Controller;

public class Meteo {
    private float temp;
    private float vent;
    private float taux;
    private Controller con = new Controller();


    public Meteo(){
        this.taux=0;
        this.vent=0;
        this.temp=0;
    }

    public void modif(float ta, float v, float te){
        this.temp=te;
        this.vent=v;
        this.taux=ta;
        con.setData(this);
    }

    public float getTemp() {
        return temp;
    }

    public float getVent() {
        return vent;
    }

    public float getTaux() {
        return taux;
    }
}
