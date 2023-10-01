package com.example.calculadora.pantallas;

import javax.swing.*;

/**
 * Clase que muestra la aplicacion de la calculadora
 * @author Tito Muñoz
 */
public class App extends JFrame {
    private JPanel PanelCalculadora;
    private JPanel pantallaResultado;
    private JPanel btnNumeros;
    private JButton btnSiete;
    private JButton btnOcho;
    private JButton btnNueve;
    private JButton btnCuatro;
    private JButton btnCinco;
    private JButton btnSeis;
    private JButton btnUno;
    private JButton btnDos;
    private JButton btnTres;
    private JButton btnCero;
    private JButton btnComa;
    private JButton btnClear;
    private JButton btnSuma;
    private JButton btnPorce;
    private JButton btnDivi;
    private JButton btnMulti;
    private JButton btnResta;

    /**
     * Constructor
     */
    public App(){
        //Se establecen los parametros para el diseño el Frame
        setContentPane(PanelCalculadora);
        ImageIcon img = new ImageIcon("C:\\Users\\34618\\IdeaProjects\\SegundoDam\\MiprimerJavaSwing\\src\\com\\example\\menus\\imagenes\\icons8-papaya-60.png");
        this.setIconImage(img.getImage());
        setTitle("Calculadora, Papaya Software");
        setSize(400,300);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
