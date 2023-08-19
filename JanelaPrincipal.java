import javax.swing.*;
import java.awt.*;

public class JanelaPrincipal extends JFrame {
    PainelSuperior painelSuperior;
    PainelCentral painelCentral;

    public JanelaPrincipal(){
        /*Painel Principal JFrame */
        super();
        this.setResizable(true);
        this.setLocation(250,250);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(600,200);
        this.setResizable(false);
        this.setVisible(true);

        painelSuperior = new PainelSuperior();
        painelCentral = new PainelCentral();

        this.getContentPane().add(BorderLayout.NORTH, painelSuperior);
        this.getContentPane().add(BorderLayout.CENTER, painelCentral);
        this.setVisible(true);

    }
}
