package Classes;

public class Livro {
    
    private Integer codigo;
    private String titulo;
    private String autor;
    private Integer numeroPaginas;
    
    public Livro(Integer codigo, String titulo, String autor, Integer numeroPaginas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public Livro(String codigo2, String titulo2, String autor2, String numeroPaginas2) {
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", codigo=" + codigo + ", numeroPaginas=" + numeroPaginas + ", titulo="
                + titulo + "]";
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}

    

    
