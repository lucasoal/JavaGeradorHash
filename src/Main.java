import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    HomeWindow homewindow = new HomeWindow();
    public static void main(String[] args) throws NoSuchAlgorithmException {
        HomeWindow.main();
        GerarHash.main();
    }
}
