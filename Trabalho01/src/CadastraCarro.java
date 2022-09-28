/*2. Crie uma classe Java para cadastrar dados relacionados à entidade definida na questão 1. 
A classe deve receber dados via teclado e os salvar em um arquivo JSON.*/

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class CadastraCarro {

    public void cadastrar(Scanner scanner, String novo) throws Exception {
        int aux = 0, id = 0, aux2 = 0, opcao;
        String modelo, marca, ano, potencia;
        List<Carros> lista = new ArrayList<Carros>();

        while (aux == 0) {

            System.out.println("Digite o modelo do carro: ");
            modelo = scanner.nextLine();

            System.out.println("Digite a marca do carro: ");
            marca = scanner.nextLine();

            System.out.println("Digite o ano do carro: ");
            ano = scanner.nextLine();

            System.out.println("Digite a potencia do carro: ");
            potencia = scanner.nextLine();

            Carros objeto = new Carros(id, modelo, marca, ano, potencia);
            lista.add(objeto);

            while (aux2 == 0) {
                System.out.println("Cadastrar mais um carro? 1 SIM ou 2 NÃO");
                opcao = scanner.nextInt();
                scanner.nextLine();
                if (opcao == 1) {
                    id += 1;
                    aux2 = 1;
                } else if (opcao == 2) {
                    aux2 = 1;
                    aux = 1;
                    break;
                }
            }
            aux2 = 0;

        }
        ListaCarros carros = new ListaCarros(lista);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        objectMapper.writeValue(new File(novo + ".json"), carros);

    }
}
