import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ListaDeCarros")

public class ListaCarros {
    private List<Carros> carros;

    public ListaCarros(){

    }

    public ListaCarros(List<Carros> carros) {
        this.carros = carros;
    }

    @JacksonXmlElementWrapper(localName = "Carros")
    @JacksonXmlProperty(localName = "Carros")

    public List<Carros> getCarros() {
        return carros;
    }

    public void setCarros(List<Carros> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return this.carros.toString();        
    }

    
}
