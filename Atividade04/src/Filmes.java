import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Catalogo")
public class Filmes {
    private List<Filme> filmes;

    public Filmes() {}

    public Filmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    @JacksonXmlElementWrapper(localName = "Filmes")
    @JacksonXmlProperty(localName = "Filme")

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public String toString() {
        return this.filmes.toString();
    }
    
}
