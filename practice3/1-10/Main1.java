import java.io.FileWriter;

public class Main1 {
    public static void main(String[] args) throws Exception {
        try (FileWriter fw = new FileWriter("data.txt")) {
            fw.write("Hello, World!\n");
            fw.write("こんにちは!\n");
            fw.write("¡Hola!\n");
        }
    }
}

