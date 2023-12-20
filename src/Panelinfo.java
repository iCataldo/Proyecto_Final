import javax.swing.*;
import java.awt.*;

public class Panelinfo extends JPanel {
    private JLabel info = new JLabel();
    public Panelinfo(){
        this.setLayout(null);
        info.setLayout(null);
        info.setBounds(5,5,290,310);
    }
    public void addinfo(JLabel label){
        info.setText(label.getText());
        this.add(info);
    }
}
