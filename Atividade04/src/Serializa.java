import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Serializa {
    public static void main(String[] args) throws Exception {
        Filme filme1 = new Filme(1, "O Poderoso Chefão", "Sinopse do filme", "Francis Ford Coppola");
        Filme filme2 = new Filme(2, "O Poderoso Chefão II", "Sinopse do filme", "Francis Ford Coppola");
        Filme filme3 = new Filme(3, "O Poderoso Chefão III", "Sinopse do filme", "Francis Ford Coppola");

        List<Filme> catalogo = new ArrayList<Filme>();

        catalogo.add(filme1);
        catalogo.add(filme2);
        catalogo.add(filme3);

        Filmes filmes = new Filmes(catalogo);

        File file = new File("catalogo.xml");

        XmlMapper xm = new XmlMapper();
        xm.enable(SerializationFeature.INDENT_OUTPUT);
        xm.writeValue(file, filmes);
    }
}
