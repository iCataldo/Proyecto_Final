import javax.swing.*;
import java.awt.*;

public class PanelBus extends JPanel {
    private Buses buses;
    private PanelSilla s1;
    //este Panel se contrulle con una clase Buses
    //Buses es una clase que contienelas ListaSilla
    //PanelBus contiene el panelsillas
    public PanelBus(Buses bus){
        buses=bus;
        if (bus!=null){
            s1=new PanelSilla(buses);
            this.add(s1);
        }

        this.setBackground(new Color(10,10,120));
        this.setLayout(null);
        this.setBounds(250,0,1100,800);
    }
    public void Blockeo(){
        this.getBuses().setEnabled(false);
    }
    public void DesBlockeo(){
        this.getBuses().setEnabled(true);
    }
    public Buses getBuses() {
        return buses;
    }
}
