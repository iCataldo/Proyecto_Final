import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioDesino {

    private String[] pais = {null, "Chile", "Argentina", "Peru", "Mordor"};
    private JComboBox list = new JComboBox(pais);
    private JComboBox list2 = new JComboBox(pais);
    private JPanel mini = new JPanel();
    //este metodo agrega una accion al interactuar con cualquiera de combobox
    public void addAccion(ActionListener a) {
        mini.setBackground(Color.lightGray);
        list.addActionListener(a);
        list2.addActionListener(a);
    }
    //posiciona los combobox en el panel mini y entrega el panel mini
    public JPanel ParametroComboBox() {
        mini.setLayout(null);
        JLabel Inicio = new JLabel("Lugar de incio:");
        JLabel Destino = new JLabel("Lugar de llegada:");
        list.setBounds(95, 20, 100, 30);
        list2.setBounds(110, 80, 100, 30);
        Inicio.setBounds(5, 20, 100, 30);
        Destino.setBounds(5, 80, 100, 30);
        mini.add(Inicio);
        mini.add(Destino);
        mini.add(list);
        mini.add(list2);
        return mini;
    }
    //getlista y getlista2 entrega la posicion de la lista en la que se encuentra los Jcombobox
    public int getlista(){
        return list.getSelectedIndex();
    }
    public int getlista2(){
        return list2.getSelectedIndex();
    }
}