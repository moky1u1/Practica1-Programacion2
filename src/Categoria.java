public class Categoria
{
    private int idCategorias;
    private String nombre;

    public Categoria(int idCategorias, String nombre) {
        this.idCategorias = idCategorias;
        this.nombre = nombre;
    }

    public int getIdCategorias() {
        return idCategorias;
    }

    public void setIdCategorias(int idCategorias) {
        this.idCategorias = idCategorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
