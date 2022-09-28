/*3. Crie uma classe Java que recebe via linha de comando o nome de um arquivo qualquer 
em formato JSON e o converte para os formatos CSV e XML. */

import java.io.File;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

public class Conversor {
    public void converte(Scanner scanner) throws Exception{
        String arquivo;
        System.out.println("Digite o nome do arquivo json para converter para csv e xml: ");
        arquivo = scanner.nextLine();
        String arquivoSemExtensao = arquivo.substring(0, arquivo.lastIndexOf('.'));
        File file = new File(arquivoSemExtensao+".json");
        ListaCarros carros = new ObjectMapper().readValue(file, ListaCarros.class);

        converteXml(carros,arquivoSemExtensao);
        converteCsv(carros,arquivoSemExtensao);

    }

    public void converteXml(ListaCarros carros, String arquivoSemExtensao) throws Exception{
        File f = new File(arquivoSemExtensao+".xml");
        XmlMapper xm = new XmlMapper();
        xm.enable(SerializationFeature.INDENT_OUTPUT);
        xm.writeValue(f,carros);
    }

    public void converteCsv(ListaCarros carros, String arquivoSemExtensao) throws Exception{
        Writer writer = Files.newBufferedWriter(Paths.get(arquivoSemExtensao+".csv"));
        StatefulBeanToCsv<ListaCarros> beanToCsv = new StatefulBeanToCsvBuilder<ListaCarros>(writer).build();
        
        beanToCsv.write(carros);

        writer.flush();
        writer.close();

    }

}
