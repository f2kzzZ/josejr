
package javaapplication8;


public class NewClass {
    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaGUI extends JFrame {

    private JTextField textField;
    private JLabel label;

    public ProgramaGUI() {
        // Configurações básicas da janela
        setTitle("Exemplo de Programa GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        // Componentes gráficos
        JButton button = new JButton("Clique aqui");
        textField = new JTextField(15);
        label = new JLabel("Texto aqui");

        // Adiciona os componentes à janela
        add(button);
        add(textField);
        add(label);

        // Adiciona listeners aos componentes
        button.addActionListener(new ButtonClickListener());
        textField.addActionListener(new TextFieldEnterListener());

    }

    // Classe interna para tratar eventos do botão
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Botão clicado!");
        }
    }

    // Classe interna para tratar a tecla Enter no campo de texto
    private class TextFieldEnterListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String textoDigitado = textField.getText();
            label.setText("Texto digitado: " + textoDigitado);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ProgramaGUI().setVisible(true);
            }
        });
    }
}

    
}
