import javax.swing.*;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerarHash {

    private static boolean IsFinished;

    public static void main() {
        if(IsFinished == true)
            JOptionPane.showMessageDialog(null, "Processo finalizado!");
        else
            JOptionPane.showMessageDialog(null, "Ops! Temos um problema." +
            "\nO processo não foi finalizado corretamente.");
    }
}
