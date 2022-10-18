/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main_calculadora;

import java.util.Scanner;
import javax.swing.*;
import javax.swing.SpringLayout.Constraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

import java.awt.*;
/**
 *
 * @author a16pedrofc
 */


public class main_calculadora extends JFrame{
   

    
    public static void main(String[] args)  {
    String[] numeros = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9"};
    String[] iguales= {"=", "=", "=", "=", "=", "=", "=", "=", "=", "=", "="};
    JButton[] buttons = new JButton[10];
    for (int i = 0; i < buttons.length; i++) {
        buttons[i]=new JButton();
    }
    
        main_calculadora frame = new main_calculadora();
        String s1[] = {"1","2","3","4","5","6","7","8","9","10"};
        JPanel panel = new JPanel(new GridLayout(5,1));
        JLabel texto= new JLabel("TABLA DE MULTIPLICAR");
        JComboBox<String> menu = new JComboBox<String>(s1);
        JPanel panel1 = new JPanel(new GridLayout(10,3));
        JPanel panel2 = new JPanel(new GridBagLayout());



      
       

        JLabel text1= new JLabel("Numero1");
        JTextArea area1= new JTextArea();
        JLabel text2= new JLabel("Numero2");
        JTextArea area2= new JTextArea();
        JLabel text3= new JLabel("Resultado");
        JTextArea area3= new JTextArea();
        CustomJButton sumar= new CustomJButton("Sumar") ;
        panel.add(texto);

      
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 10; j++) {
                CustomJButton boton = new  CustomJButton(numeros[j]);
                CustomJButton boton2 = new  CustomJButton(iguales[j]);
               JButton boton3 = (buttons[j]);
               panel1.add(boton);
               panel1.add(boton2);
               panel1.add(boton3);
            }   
           }
           menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String num=menu.getSelectedItem().toString();
            int numero= Integer.valueOf(num);
            Clase_matematica multiplicar=new Clase_matematica(numero);
            int numeros[]= multiplicar.multiplicar();
             for (int i = 0; i < 10; i++) {
                buttons[i].setText(Integer.toString(numeros[i]));
             }
            }
         });


        panel.add(menu);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.CENTER;
        panel2.add(text1,constraints); 
        constraints.gridx = 1; // El área de texto empieza en la columna cero.
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weightx = 1.0;
        panel2.add(area1,constraints);
        constraints.gridx = 2; // El área de texto empieza en la columna cero.
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridheight = 3;
        panel2.add(sumar,constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.weightx = 1.0;
        panel2.add(text2,constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panel2.add(area2,constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.CENTER;
        panel2.add(text3,constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        panel2.add(area3,constraints);
        
    //Acabar metodo suma 
        sumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            int primerNum=Integer.valueOf(area1.getText());
            int segundoNum=Integer.valueOf(area2.getText());
            Clase_matematica suma=new Clase_matematica(primerNum);
            int resultado=suma.sumar(segundoNum);
            area3.setText(Integer.toString(resultado));
            }
         });



        frame.add(panel1, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.setSize(450,850);
        frame.setTitle("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        }
    
}
