import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;

public class Main {
    public static Properties getProperties(Properties prop) throws IOException {
        FileInputStream file = new FileInputStream("arquivo.txt");
        prop.load(file);

        return prop;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        Properties props = new Properties();
        getProperties(props);

        System.out.println("----------------------------------------------------------------");
        System.out.println("NOME DO ARQUIVO: arquivo.txt");
        System.out.println("----------------------------------------------------------------");

        System.out.println("Digite o nome do arquivo");
        String file = input.next();

        System.out.println("----------------------------------------------------------------");
        System.out.println("PARA PASSAR ALGUMA DAS LINHAS INDEFINIDAS DIGITE 0");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Digite a linha de inicio:");
        int initialLine = input.nextInt();

        System.out.println("Digite a linha final:");
        int endLine = input.nextInt();

        File arquivo = new File(file);
        Scanner scanner = new Scanner(arquivo);

        FileInputStream open = new FileInputStream(file);
        InputStreamReader is = new InputStreamReader(open);
        BufferedReader br = new BufferedReader(is);

        String linha;
        String n;
        int cont = 0;

        while (scanner.hasNextLine()) {
            scanner.nextLine();
            cont++;
        }

        if (initialLine == 0) {
            initialLine = 1;
            for (int i = 1; i <= endLine; i++) {
                if (i < initialLine) {
                    linha = br.readLine();
                } else if (i >= initialLine) {
                    linha = br.readLine();
                    if (linha != null)
                        System.out.println(linha);
                }
            }

        } else if (endLine == 0) {
            endLine = cont;
            for (int i = 1; i <= endLine; i++) {
                if (i < initialLine) {
                    linha = br.readLine();
                } else if (i >= initialLine) {
                    linha = br.readLine();
                    if (linha != null)
                        System.out.println(linha);
                }
            }
        }
    }
}
