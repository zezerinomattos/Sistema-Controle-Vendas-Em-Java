package br.com.projeto.model;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Utilitarios {
    
    public void LimpaTela(JPanel container){
        Component componentes[] = container.getComponents();
        for(Component component : componentes){
            if(component instanceof JTextField){
                ((JTextField)component).setText(null);
            }
        }
    }
    
}
