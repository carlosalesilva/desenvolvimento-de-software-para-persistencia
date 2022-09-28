public class Filme {
    private int id;
    private String titulo;
    private String sinopse;
    private String diretor;

    public Filme(int id, String titulo, String sinopse, String diretor) {
        this.id = id;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.diretor = diretor;
    }

    public Filme() {}

    @Override
    public String toString() {
        return "Filme{" +
        "id=" + id +
        ", titulo='" + titulo + '\'' +
        ", sinopse='" + sinopse + '\'' +
        ", diretor='" + diretor + '\'' +
        '}';
    }

    public int getId() {
        return this.id;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}
