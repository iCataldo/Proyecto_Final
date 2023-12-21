import javax.swing.*;
import java.awt.*;

public class PanelinfoColor extends JPanel {
    private JButton button1 = new JButton();
    private JButton button2 = new JButton();
    private JButton button3 = new JButton();
    private JLabel label1 = new JLabel();
    private JLabel label2 = new JLabel();
    private JLabel label3 = new JLabel();

    public PanelinfoColor(){
        this.setLayout(null);
        button1.setBounds(5,5,45,45);
        button2.setBounds(5,55,45,45);
        button3.setBounds(5,105,45,45);
        label1.setBounds(65,5,150,45);
        label2.setBounds(65,55,150,45);
        label3.setBounds(65,105,150,45);
        label1.setText("Asiento disponible");
        label2.setText("Asiento selecionado");
        label3.setText("Asiento ocupado");
        button1.setText("N");
        button2.setText("N");
        button3.setText("N");
        button1.setBackground(Color.GRAY);
        button2.setBackground(Color.green);
        button3.setBackground(Color.red);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(label1);
        this.add(label2);
        this.add(label3);
    }
}
