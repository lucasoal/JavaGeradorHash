import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HomeWindow extends JFrame {
    private JPanel HomeWindowPanel;
    private JButton GerarHashBtn, SairBtn;
    private JTextField GerarHashCaminho;
    private JButton ProcurarBtn;
    private JLabel Resultado;
    private JTextArea façaOTeuMelhorTextArea;
    private JLabel DateHour;
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
        janela.setSize(570, 218);
        janela.setResizable(true);
    }
}