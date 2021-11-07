import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class HomeWindow extends JFrame {
    private static Image icon = Toolkit.getDefaultToolkit().getImage(".\\assets\\icon02_32.png");
    private JPanel  HomeWindowPanel;
    private JButton GerarHashBtn, SairBtn, ProcurarBtn;
    private JTextField GerarHashCaminho;
    private JLabel Resultado, DateHour;
    private JTextArea HashResult;
    private JLabel TipoCript;
    private JTextField TipoCriptografia;

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
                JOptionPane.showMessageDialog(null, "Botão clicado!");
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