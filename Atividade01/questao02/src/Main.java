import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    Scanner userInputInt = new Scanner(System.in);
    static Scanner userInputLine = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Digite o caminho do arquivo de origem:");
        String rementente = userInputLine.nextLine();
        System.out.println("Digite o caminho do arquivo de destino:");
        String destinatario = userInputLine.nextLine();
        FileInputStream arquivo = new FileInputStream(rementente);
        Scanner entrada = new Scanner(arquivo);
        InputStream dest = new FileInputStream(destinatario);
        PrintStream prints = new PrintStream(destinatario);
        while (entrada.hasNext()) {
            prints.println(entrada.nextLine());
            System.out.println("copiado");
        }

    }
}