import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class PainelSuperior extends JPanel {
    JLabel title;
    JLabel welcome;

    public PainelSuperior() {
        /*Layout*/
        super(new GridLayout(2, 1));

        /*Titulo*/
    title = new JLabel("Conversor de Temperaturas");
    title.setFont(new Font("Sans", Font.PLAIN, 21));
    title.setHorizontalAlignment(SwingConstants.CENTER);
    ImageIcon icon = new ImageIcon("icon.png");
    title.setIcon(new ImageIcon(icon.getImage().getScaledInstance(42,42, Image.SCALE_SMOOTH)));


     /*Welcome message*/
    welcome = new JLabel("Seja bem vindo, vamos converter algumas temperaturas.");
    welcome.setFont(new Font("Sans", Font.PLAIN, 15));
    welcome.setHorizontalAlignment(SwingConstants.CENTER);

    this.add(title);
    this.add(welcome);

    }
}
