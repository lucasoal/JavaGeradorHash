import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;

public class HomeWindow extends JFrame {
    private static Image icon = Toolkit.getDefaultToolkit().getImage(".\\assets\\icon02_32.png");
    private JPanel  HomeWindowPanel;
    private JButton GerarHashBtn, SairBtn, ProcurarBtn;
    private JTextField GeraHashCaminho;
    private JRadioButton MD5Btn;
    private JRadioButton SHABtn;
    public String SetHashType;
    public HomeWindow()
    {
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
                try {
                    String pwd = GeraHashCaminho.getText();
                    GerarHash.main(pwd,SetHashType);
                    JOptionPane.showMessageDialog(null, SetHashType + " selecionada");
                } catch (NoSuchAlgorithmException ex) {
                    ex.printStackTrace();
                }
            }
        });
        MD5Btn.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) { SetHashType = "MD5"; }
        });
        SHABtn.addActionListener(new ActionListener() {
            @Override public void actionPerformed(ActionEvent e) { SetHashType = "SHA"; }
        });
    }

    public static void main()
    {
        JFrame janela = new JFrame("JavaGeradorHash");
        janela.setContentPane(new HomeWindow().HomeWindowPanel);
        janela.setIconImage(icon);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setSize(400, 140);
        janela.setResizable(true);
        janela.setLocationRelativeTo(null);
    }
}