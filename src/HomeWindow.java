import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWindow extends JFrame {
    private JPanel HomeWindowPanel;
    private JButton GerarHash, CompararHashA, CompararHashB, Sair;
    private JTextField GerarHashCaminho, CompararHashA_txt, CompararHashB_txt;
    private static Image icon = Toolkit.getDefaultToolkit().getImage(".\\assets\\icon02_32.png");

    public HomeWindow(){
        // Definição do botão Sair
        Sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { System.exit(0); }
        });
    }

    public static void main() {
        JFrame janela = new JFrame("JavaGeradorHash");
            janela.setContentPane(new HomeWindow().HomeWindowPanel);
            janela.setVisible(true);
            janela.setIconImage(icon);
            janela.setSize(500, 200);
            janela.setResizable(false);
    }
}