import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSilla extends JPanel {
    private int a=45;
    private int posicionSX =20;
    private int posicionSY =60;
    private JPanel label;
    private ListaCompra compra=new ListaCompra();
    private ListaSilla silla;
    private JLabel precio=new JLabel("$ "+compra.getPrecioTotal());;
    private JButton comprador= new JButton("Comprar!!");
    //PanelSilla coloca la sillas en el panel
    // int a es el ancho y largo del boton
    //posicionSX y posicionSY son las posicione siniciales de los votones que despues vaian para colocar
    // precio es la etiqueta que marca el costo acumulodo por selecionar silla
    // Boton de compra para blockear los botones marcados
    public PanelSilla(ListaSilla silla){
        comprador.setBounds(600,400,200,150);
        comprador.addActionListener(PaComprar);
        this.add(comprador);
        preciototal();
        this.silla=silla;
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setBounds(0,60,840,600);
        JLabel piso1=new JLabel("Primer piso:");
        piso1.setBounds(20,15,100,60);
        this.add(piso1);
        for (int i=0;i<silla.getCapacidad();i+=4) {
            if (i==36){
                JLabel piso2=new JLabel("Segundo piso:");
                piso2.setBounds(20,4*a+115,100,60);
                this.add(piso2);
                posicionSX =20;
                posicionSY+=4*a+100;
            }
            ColocarSilla(i);
            ColocarSilla(i+1);
            posicionSY+=20;
            ColocarSilla(i+2);
            ColocarSilla(i+3);
            posicionSX+=10+a;
            posicionSY-=4*a+60;
        }

    }
    // este metodo coloca los ButtonSilla segun la posicionSX/SY y le define una accion
    public void ColocarSilla(int i){
        ButtonSilla button;
        if(silla.getSilla(i)!=null) {
            button=new ButtonSilla(silla.getSilla(i));
            button.setBounds(posicionSX, posicionSY, a, a);
            /*esta ActionListener marca los butones de un color y los agrega a la
            lista compra ademas de desmarcar y sacar de la listacompra
             */
            ActionListener accion = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(button.getBackground()==Color.GRAY){
                        button.setBackground(Color.green);
                        compra.add(button);
                    }
                    else {
                        button.setBackground(Color.GRAY);
                        compra.remove(button);
                    }
                    preciototal();
                }
            };
            button.addActionListener(accion);
            this.add(button);
        }
        else {
            this.add(new JButton("null"));
        }
        posicionSY+=10+a;
    }
    //actulisa el costo por los botones marcados
    public void preciototal(){
        precio.setBounds(780,10,60,40);
        precio.setText("$ "+compra.getPrecioTotal());
        this.add(precio);
    }
    //accion de bloquear los botones marcados
    public ActionListener PaComprar = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            compra.borrar();
            preciototal();
        }
    };

}
