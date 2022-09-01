import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) throws IOException {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo 01:");
        String caminho1 = sc1.nextLine();
        System.out.println("Digite o caminho do arquivo 02:");
        String caminho2 = sc1.nextLine();
        System.out.println("Digite o caminho do arquivo 03:");
        String caminho3 = sc1.nextLine();

        InputStream lerArquivo1 = new FileInputStream(caminho1);
        InputStream lerArquivo2 = new FileInputStream(caminho2);

        Scanner arquivo1 = new Scanner(lerArquivo1);
        Scanner arquivo2 = new Scanner(lerArquivo2);

        String texto1 = "";
        String texto2 = "";

        while (arquivo1.hasNextLine() || arquivo2.hasNextLine()) {

            if (arquivo1.hasNextLine()) {
                texto1 += (arquivo1.nextLine()) + "\n";
            }

            if (arquivo2.hasNextLine()) {
                texto2 += (arquivo2.nextLine()) + "\n";
            }
        }

        String texto3 = texto1 + texto2;

        PrintStream ps = new PrintStream(caminho3);

        for (int i = 0; i < texto3.length(); i++) {
            ps.write(texto3.charAt(i));
        }
        ps.close();

        arquivo2.close();
        arquivo1.close();

    }
}
