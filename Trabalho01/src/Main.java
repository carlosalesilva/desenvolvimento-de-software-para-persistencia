import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String novoCarro;
        Scanner scanner = new Scanner(System.in);
        int aux = 0;

        while (aux == 0) {
            System.out.println("Digite o nome da sua nova lista de carros: ");
             novoCarro = scanner.nextLine();
             if (new File(novoCarro + ".json").exists()) {
                System.out.println("Lista já existente, digite um nome diferente.");
                aux = 0;
            } else {
                CadastraCarro cadastraCarro = new CadastraCarro();
                cadastraCarro.cadastrar(scanner, novoCarro);
                Conversor converteJson = new Conversor();
                converteJson.converte(scanner);
                CompactaZip compactar = new CompactaZip();
                compactar.zip(scanner);
                HashSha1 hashSha1 = new HashSha1();
                hashSha1.gerar(scanner);
                aux = 1;
            }
        }        
        scanner.close();
    }
}
