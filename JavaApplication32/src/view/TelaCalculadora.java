
package view;

import java.awt.Color;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Calculadora;

/**
 *
 * @author momed003
 */
public class TelaCalculadora {
    
    public static void main(String[] args) {
        Calculadora obj=new Calculadora();
        
        JFrame telPrincipal= new JFrame("My calculator");//crinado instancia do jframe com titulo
        telPrincipal.setSize(500,500);
        telPrincipal.setVisible(true);//tornando a tela visivel
        
        JButton botaoSoma= new JButton("+");
        botaoSoma.setBounds(110, 120, 75, 35);
        botaoSoma.setBackground(new Color(252,252,252));
        
        telPrincipal.add(botaoSoma);
    }
    
}
