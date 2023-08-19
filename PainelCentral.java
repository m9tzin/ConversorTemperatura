import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PainelCentral extends JPanel implements ActionListener {
    JLabel help;
    JTextField input;
    JButton button;

    public PainelCentral() {
        super(new FlowLayout(FlowLayout.CENTER, -1, 6));
        help = new JLabel("Insira o valor em Celsius para convertê-lo em Fahrenheit!");
        help.setHorizontalAlignment(SwingConstants.CENTER);
        help.setFont(new Font("Sans", Font.BOLD, 10));
        help.setPreferredSize(new Dimension(500, 24));

        input = new JTextField(15);
        input.setHorizontalAlignment(SwingConstants.CENTER);

        button = new JButton("Converter!");

        this.add(help);
        this.add(input);
        this.add(button);
        button.addActionListener(this);
        input.addActionListener(this);
    }

    public double CelsiustoFahrenheit(double c) {
        double k = 0;
        k = c * 1.8 + 32;
        return k;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(button) || event.getSource().equals(input)) {
            try {
                double valorCelsius = Double.parseDouble(input.getText());
                String respostaCelsius = valorCelsius + "ºC é igual a " + CelsiustoFahrenheit(valorCelsius) + "ºF";
                JOptionPane.showMessageDialog(null, respostaCelsius, "Resposta do conversor", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                e.printStackTrace();
                String error = "";
                if (input.getText().isEmpty()) {
                    error = "Não foi informado nenhum valor, por favor, insira um número válido.";
                } else {
                    error = input.getText() + "é um valor inválido, insira um número.";
                    input.setText("");
                }
                JOptionPane.showMessageDialog(null, error, "Resposta do Conversor", JOptionPane.ERROR_MESSAGE);

            }
        }
    }
}