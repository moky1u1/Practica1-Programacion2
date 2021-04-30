public class Aeropuerto
{
    private String codigoAeropuerto;
    private String nombre;
    private Ciudad ciudad;

    public Aeropuerto(String codigoAeropuerto, String nombre, Ciudad ciudad) {
        this.codigoAeropuerto = codigoAeropuerto;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getCodigoAeropuerto() {
        return codigoAeropuerto;
    }

    public void setCodigoAeropuerto(String codigoAeropuerto) {
        this.codigoAeropuerto = codigoAeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
