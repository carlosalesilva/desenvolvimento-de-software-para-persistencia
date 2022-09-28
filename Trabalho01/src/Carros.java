/*1. Defina uma entidade principal com pelo menos 5 atributos e relacionada a um domínio de problema. 
Crie também uma classe Java para representá-la. Exemplo de entidade com 9 atributos: Cliente: id, nome, 
cpf, endereço, email, fone, cidade, uf, cep. A entidade deve estar relacionada a algo que você gosta 
bastante como: hobie, esporte, pet, alimentação, educação, música, filmes, séries, redes sociais, etc. 
A entidade escolhida por você não pode ser a entidade Cliente dada como exemplo. Escolha uma entidade 
bem diferente dela, inclusive quanto aos seus atributos.
 */


public class Carros {
    private int id;
    private String modelo;
    private String marca;
    private String ano;
    private String potencia;

    public Carros(){

    }

    public Carros(int id, String modelo, String marca, String ano, String potencia) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.potencia = potencia;
    }



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setTitulo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getPotencia() {
        return potencia;
    }
    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "ListaDeCarros{" +
        "Carro='" + id + '\'' +
        ", modelo='" + modelo + '\'' +
        ", marca='" + marca + '\'' +
        ", ano='" + ano + '\'' +
        ", potencia='" + potencia + '\'' +
        '}';
    }
}
