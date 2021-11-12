import javax.swing.*;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

public class GerarHash {

    File stream;
    Date data = new Date(stream.lastModified());
    byte[] bytesEntradaHash = null, bytesSaidaHash = null;
    StringBuilder hashHexadecimal;
    String hash;
    FileOutputStream saida;
    DataOutputStream escritor;

    public void SistemaArquivos() {
        if(stream.exists()){
        JOptionPane.showMessageDialog(null,
        "Arquivo encontrado!!!",
        "Atenção!!!", JOptionPane.PLAIN_MESSAGE);
        }
        else {
        JOptionPane.showMessageDialog(null,
        "Arquivo '" + stream + "' não encontrado!!!",
        "Atenção!!!", JOptionPane.WARNING_MESSAGE);
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

    public void MethodGeraArquivo(String hash){
        try{
            saida = new FileOutputStream("./log.txt");
            escritor = new DataOutputStream(saida);
//            JOptionPane.showMessageDialog(null, hash);
            escritor.writeUTF("\n./assets/JavaLogo.jpg\t" + hash+ "\n");
            saida.close();
        }
        catch (IOException erro){}
    }

    public static void main() throws NoSuchAlgorithmException  {
        GerarHash GH = new GerarHash();
        GH.SistemaArquivos();
        //String hash = GH.MethodCalculaHash("./assets/JavaLogo.jpg");
        //GH.MethodGeraArquivo(hash);
        //JOptionPane.showMessageDialog(null, "Hash Gerada com sucesso!\n\n" + hash);
    }
}
