
package LibreriaEntidades;

public class LibreriaEntidades {
    private String ISBN;
    private String Titulo;
    private String Autor;
    private int NumPaginas;

    public LibreriaEntidades() {
    }

    public LibreriaEntidades(String ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }
    
    
}
