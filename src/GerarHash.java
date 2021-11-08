import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GerarHash {

    File stream = new File("./assets/JavaLogo.jpg");
    byte[] bytesEntradaHash = null, bytesSaidaHash = null;
    StringBuilder hashHexadecimal;
    String hash;

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

    public String MethodCalculaHash(String arquivo) throws NoSuchAlgorithmException {
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
        return hash;
    }

    public static String main() throws NoSuchAlgorithmException  {
        GerarHash FileSystem = new GerarHash();
        GerarHash Calcula = new GerarHash();

        String hash = Calcula.hash;

        FileSystem.SistemaArquivos();
        Calcula.MethodCalculaHash("./assets/JavaLogo.jpg");

        return hash;
    }
}
