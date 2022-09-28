import java.io.File;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Desserializa {
    public static void main(String[] args) throws Exception {
        File file = new File("catalogo.xml");
        XmlMapper xmlMapper = new XmlMapper();

        Filmes f = xmlMapper.readValue(file, Filmes.class);

        System.out.println(f);
    }
}
