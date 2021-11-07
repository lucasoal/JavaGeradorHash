import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class GerarHash {

    File stream = new File("./assets/JavaLogo.jpg");
    byte[] bytesEntradaHash = null, bytesSaidaHash = null;
    StringBuilder hashHexadecimal;
    String hash = null;

    public void SistemaArquivos() {
        if(stream.exists()){
            System.out.printf("Arquivo encontrado!\n");
        }
        else {
            JOptionPane.showMessageDialog(null,
            "Arquivo '" + stream + "' não encontrado!!!",
            "Atenção!!!",
            JOptionPane.WARNING_MESSAGE);
        }

    }

    public void MethodCalculaHash(String arquivo) throws NoSuchAlgorithmException {
        try {
            bytesEntradaHash = Files.readAllBytes(stream.toPath());
            MessageDigest algoritmoHash = MessageDigest.getInstance("MD5");
            bytesSaidaHash = algoritmoHash.digest(bytesEntradaHash);

            hashHexadecimal = new StringBuilder();
            for (byte b : bytesSaidaHash) {
                hashHexadecimal.append(String.format("%02X", 0xFF & b));
            }

            System.out.println("Sequência de Bytes da HASH Gerada pelo Algoritmo MD5");
            hash = hashHexadecimal.toString();
            System.out.println(hash + "\n");

        } catch (IOException erro) {}
    }

    public static void main() throws NoSuchAlgorithmException  {
        /*{
            if (IsFinished == true)
                JOptionPane.showMessageDialog(null, "Processo finalizado!");
            else
                JOptionPane.showMessageDialog(null, "Ops! Temos um problema." +
                        "\nO processo não foi finalizado corretamente.");
        }*/
        GerarHash FileSystem = new GerarHash();
        GerarHash Calcula = new GerarHash();

        FileSystem.SistemaArquivos();
        Calcula.MethodCalculaHash("./assets/JavaLogo.jpg");
    }
}
