import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWindow extends JFrame {
    private JPanel HomeWindowPanel;
    private JButton GerarHashBtn,
            CompararHashABtn,
            CompararHashBBtn,
            SairBtn;
    private JTextField GerarHashCaminho,
            CompararHashA_txt,
            CompararHashB_txt;
    private static Image icon = Toolkit.getDefaultToolkit().getImage(".\\assets\\icon02_32.png");

    public HomeWindow(){
        // Definição do botão Sair
        SairBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        // Definição do botão GerarHash
        GerarHashBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GerarHash.main();
            }
        });
    }

    public static void main() {
        JFrame janela = new JFrame("JavaGeradorHash");
        janela.setContentPane(new HomeWindow().HomeWindowPanel);
        janela.setIconImage(icon);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setSize(500, 200);
        janela.setResizable(true);
    }
}