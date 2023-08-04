import java.net.URL;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        InputStream conn = url.openStream();
        int i = conn.read();

        while (i != -1) {
            System.out.print((char) i);
            i = conn.read();
        }

        conn.close();
    }
}
