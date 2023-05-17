/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.print.DocFlavor;
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
     JButton btnDivisao= new JButton("/");
     JButton btnClear= new JButton("C");
     JLabel  lblresultado=new JLabel("",JLabel.CENTER);
     JFormattedTextField txtNum1= new JFormattedTextField();
     JFormattedTextField txtNum2= new JFormattedTextField();
     Calculadora cal=new Calculadora();
     private ArrayList <String>  historico;
       
     ActionListener al = new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
             System.out.println(((JComponent)e.getSource()).getName()) ;
         }
     };
   
     public TelaCalTest(){
        historico=new ArrayList<>();
     //painel Principal

            painel1.setBackground(Color.white);
            painel1.setLayout(null);
            lblresultado.setFont(new Font ("Calibri",Font.BOLD,12));
            btnClear.setBackground(Color.BLACK);
            btnClear.setForeground(Color.white);
        
      //botoes acoes 
            btnClear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                txtNum1.setText("");
                txtNum2.setText("");
                lblresultado.setText("");
                
            }
            });
            btnDivisao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                double num1=Double.parseDouble(txtNum1.getText());
                double num2=Double.parseDouble(txtNum2.getText());
                if (num2!=0) {
                    lblresultado.setText(String.valueOf(cal.divsao(num1, num2)));
                    historico.add(lblresultado.getText());
                }else{
                    lblresultado.setText("esta operacao nao pode ocorrer");
                }
                 
            }
            });
            btnMultiplicacao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               double num1=Double.parseDouble(txtNum1.getText());
               double num2=Double.parseDouble(txtNum2.getText());
               lblresultado.setText(String.valueOf(cal.multiplicacao(num1, num2)));
                historico.add(lblresultado.getText());
            }
            });
            btnsubtracao.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                   double num1=Double.parseDouble(txtNum1.getText());
                    double num2=Double.parseDouble(txtNum2.getText());
                    lblresultado.setText(String.valueOf(cal.subtracao(num1, num2)));
                     historico.add(lblresultado.getText());
            }
            });
            btnsoma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                double num1=Double.parseDouble(txtNum1.getText());
                double num2=Double.parseDouble(txtNum2.getText());
                double soma=num1+num2;
                lblresultado.setText(String.valueOf(soma));
                 historico.add(lblresultado.getText());
            }
            });
            
        //LOCALIZACAO DOS BOTOES
            btnClear.setBounds(290, 50, 50, 40);
            btnDivisao.setBounds(230, 50, 50, 40);
            btnMultiplicacao.setBounds(170, 50, 50, 40);
            btnsubtracao.setBounds(110, 50, 50, 40);
            btnsoma.setBounds(50, 50, 50, 40);
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
   
     public void lista(){
         for (int i = 10; i < historico.size(); i--) {
             System.out.println(historico);
         }
     }
    
    public static void main(String[] args) {
       new TelaCalTest();
       
      
    }}


