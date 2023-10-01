package com.example.calculadora.pantallas;

import javax.swing.*;

/**
 * Clase para mostrar la Pantalla Principal
 * @author Tito Muñoz
 */
public class MenuPrincipal extends JFrame {
    //declaracion de componentes
    private JPanel PanelMain;
    private JLabel tituloMain;
    private JButton abrirAplicacionButton;

    /**
     * Constructor
     */
    public MenuPrincipal(){
        //Se establecen los parametros para el diseño el Frame
        setContentPane(PanelMain);
        ImageIcon img = new ImageIcon("C:\\Users\\34618\\IdeaProjects\\SegundoDam\\MiprimerJavaSwing\\src\\com\\example\\menus\\imagenes\\icons8-papaya-60.png");
        this.setIconImage(img.getImage());
        setTitle("Home, Papaya Software");
        setSize(400,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //boton que cambia a otro Frame
        abrirAplicacionButton.addActionListener(a ->{
            dispose();
            new App();
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
