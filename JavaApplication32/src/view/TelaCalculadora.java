
package view;

import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Calculadora;

/**
 *
 * @author momed003
 */
public class TelaCalculadora {
    
    public void ActionPerformed(ActionEvent e){
        double num1;
        double num2;
        double s;
       
    }
    
    public static void main(String[] args) {
        Calculadora obj=new Calculadora();
        
        JFrame telPrincipal= new JFrame("My calculator");//crinado instancia do jframe com titulo
        telPrincipal.setSize(500,500);
        telPrincipal.setVisible(true);//tornando a tela visivel
        
        //PAINEL principal
        JPanel painel1=new JPanel();
        painel1.setSize(500,500);
        painel1.setBackground(Color.WHITE);
        
        //BOTAO PARA SOMA
        JButton botaoSoma= new JButton("+");
        botaoSoma.setBounds(110, 120, 75, 35);
        botaoSoma.setBackground(new Color(252,252,252));
        
        //BOTAO PARA SUBTRACAO
        JButton botaoSubtracao= new JButton("-");
        botaoSubtracao.setBounds(110, 120, 75, 35);
        botaoSubtracao.setBackground(new Color(252,252,252));
        
        //BOTAO PARA MULTIPLICACAO
        JButton botaoMultiplicacao= new JButton("*");
        botaoMultiplicacao.setBounds(110, 120, 75, 35);
        botaoMultiplicacao.setBackground(new Color(252,252,252));
        
        //BOTAO PARA DIVISAO
        JButton botaoDivisao= new JButton("/");
        botaoDivisao.setBounds(110, 120, 75, 35);
        botaoDivisao.setBackground(new Color(252,252,252));
        
        //BOTAO PARA APGAR OS COMPONENTES
        JButton botaoC= new JButton("+");
        botaoC.setBounds(110, 120, 75, 35);
        botaoC.setBackground(new Color(252,252,252));
        
        //Botoes Alfa-numeriocs
//       JButton b1=new JButton("1");
//       JButton b2=new JButton("2");
//       JButton b3=new JButton("3");
//       JButton b=new JButton("4");
//       JButton b5=new JButton("5");
//       JButton b6=new JButton("6");
//       JButton b7=new JButton("7");
//       JButton b8=new JButton("8");
//       JButton b9=new JButton("9");
//       JButton b0=new JButton("0");
       JButton bIgual=new JButton("=");
   
        
        Label lblText=new Label("0", Label.RIGHT);
        lblText.setBackground(Color.BLUE);
        lblText.setForeground(Color.WHITE);
        lblText.setEnabled(false);
        
        JTextField txtnum1=new JTextField();
        txtnum1.setBackground(Color.white);
        txtnum1.setBounds(50,100, 200,30); 
           
        JTextField txtnum2=new JTextField();
        txtnum2.setBackground(Color.white);
        txtnum2.setBounds(50,100, 200,30);
        
        //criando accoes nos botoes
       

    }
    
}
