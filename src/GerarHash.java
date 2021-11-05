import javax.swing.*;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerarHash {

    private static boolean IsFinished = false;
    private String pwd;
    public LocalDateTime DataHora;

    public void DataHora(){
        DateTimeFormatter tempoFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime tempo = LocalDateTime.now();
        System.out.println(tempoFormat.format(tempo));
    }

    public static void main() {
        if(IsFinished == true)
            JOptionPane.showMessageDialog(null, "Processo finalizado!");
        else
            JOptionPane.showMessageDialog(null, "Ops! Temos um problema." +
            "\nO processo não foi finalizado corretamente.");
    }
}
