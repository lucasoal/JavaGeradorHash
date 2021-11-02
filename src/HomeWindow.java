import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWindow {
    private JPanel HomeWindowPanel;
    private JButton GerarHash;
    private JTextField GerarHashCaminho;
    private JButton CompararHash;
    private JTextField CompararHashCaminho;
    private JButton Sair;


    public HomeWindow() {
        // Definição do botão Sair
        Sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { System.exit(0); }
        });
    }

    public static void main(String[] args) {
        JFrame janela = new JFrame("JavaGeradorHash");
        janela.setContentPane(new HomeWindow().HomeWindowPanel);
        janela.setDefaultCloseOperation(janela.getDefaultCloseOperation());
        janela.setVisible(true);
    }
}