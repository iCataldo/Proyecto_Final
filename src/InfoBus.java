import javax.swing.*;
import java.awt.*;

public class InfoBus extends JLabel {
    public InfoBus(Tiempo tiempo){
        this.setLayout(null);
        if (tiempo!=null) {
            this.setText("<html><br>Importante: tiempo estimado de " + tiempo.getTiempo() + " minutos." +
                    "<br><br> - Buses chicos y grande saldran: 10:00am, 1:00pm, 4:00pm, 7:00pm, 10:00pm, 1:00am." +
                    "<br><br> - Buses doble saldran: 12:00am, 2:00pm, 6:00pm, 9:00pm, 11:00pm." +
                    "<br>  Ademas el tiempo estimado de los buses dobles es " + (tiempo.getTiempo() + 11) + " minutos.<html>");
        }

    }
}
