/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Calculadora;



/**
 *
 * @author momed003
 */
public class TelaCalTest extends javax.swing.JFrame  {
  
    
     JPanel painel1=new JPanel();
     JButton btnsoma= new JButton("+");
     JButton btnsubtracao= new JButton("-");
     JButton btnMultiplicacao= new JButton("*");
     JButton btnDivisao= new JButton("*");
     JButton btnClear= new JButton("C");
     JLabel  lblresultado=new JLabel("",JLabel.CENTER);
     JFormattedTextField txtNum1= new JFormattedTextField();
    
     JFormattedTextField txtNum2= new JFormattedTextField();
     Calculadora cal=new Calculadora();
     
//      double num1=Double.parseDouble(txtNum1.getText());
//     double num2=Double.parseDouble(txtNum1.getText());
       
     ActionListener al = new ActionListener() {
         
         public void ActionPerfomed(ActionEvent e){
        if (e.getSource()==btnsoma){

          
        }
        if (e.getSource()==btnsubtracao){
            JOptionPane.showMessageDialog(null, "ehhh");
        }
        else if (e.getSource()==btnMultiplicacao){
            JOptionPane.showMessageDialog(null, "ehhh");
        }
        else if (e.getSource()==btnDivisao){
            JOptionPane.showMessageDialog(null, "ehhh");
        }
        else if (e.getSource()==btnClear){
            JOptionPane.showMessageDialog(null, e);
             
        }
        
    }

         @Override
         public void actionPerformed(ActionEvent e) {
             System.out.println(e);
             //System.out.println(((JComponent)e.getSource()).getName()) ;
         }
     };
    public TelaCalTest(){
     //painel Principal
//     double num1=Double.parseDouble(txtNum1.getText());
//     double num2=Double.parseDouble(txtNum2.getText());
    
            painel1.setBackground(Color.white);
            painel1.setLayout(null);
            lblresultado.setFont(new Font ("Calibri",Font.BOLD,12));
//            lblresultado.setText();
            btnClear.setBackground(Color.BLACK);
            btnClear.setForeground(Color.white);
        
      //botoes acoes 
            btnClear.setBounds(290, 50, 50, 40);
            btnClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
           
            }
            });
            btnDivisao.setBounds(230, 50, 50, 40);
            btnDivisao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(rootPane, "Eu sou o cara");
            }
            });
            btnMultiplicacao.setBounds(170, 50, 50, 40);
            btnMultiplicacao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               // JOptionPane.showMessageDialog(rootPane, "Eu sou o cara");
            }
            });
            btnsubtracao.setBounds(110, 50, 50, 40);
             btnDivisao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //JOptionPane.showMessageDialog(rootPane, "Eu sou o cara");
            }
            });
            btnsoma.setBounds(50, 50, 50, 40);
             btnsoma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                double num1=Double.parseDouble(txtNum1.getText());
                double num2=Double.parseDouble(txtNum2.getText());
                double soma=num1+num2;
                lblresultado.setText(String.valueOf(soma));
            }
            });
            txtNum1.setBounds(50, 110, 300, 40);
            txtNum2.setBounds(50, 200, 300, 40);
            lblresultado.setBounds(50, 300, 300, 40);

        //estilizando o frame
            JFrame janela1=new JFrame("My Calculator");
            janela1.setSize(400,400);
            janela1.getContentPane().setBackground(Color.WHITE);
            janela1.setDefaultCloseOperation(EXIT_ON_CLOSE);
            janela1.setLocationRelativeTo(null);
            janela1.setResizable(false);
            janela1.setVisible(true);   
        
        //add componentes 
            janela1.add(painel1);
            painel1.add(btnsoma);
            painel1.add(btnsubtracao);
            painel1.add(btnDivisao);
            painel1.add(btnMultiplicacao);
            painel1.add(txtNum1);
            painel1.add(txtNum2);
            painel1.add(lblresultado);
            painel1.add(btnClear);
            
           btnClear.addActionListener(al);
           btnDivisao.addActionListener(al);
           btnMultiplicacao.addActionListener(al);
           btnsoma.addActionListener(al);
           btnsubtracao.addActionListener(al);
           txtNum1.setText("0");
           txtNum2.setText("0");
           
       
    }
   
    
    public static void main(String[] args) {
       new TelaCalTest();
      
    }}


