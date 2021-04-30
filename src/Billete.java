import java.util.Date;
import java.util.List;

public class Billete
{
    private int idBillete;
    private Date fechaEmision;
    private double precioTota;
    private Cliente cliente;
    private Ciudad origen;
    private Ciudad destino;
    private Categoria categoria;
    private List<Vuelo> vuelos;

    public Billete(int idBillete, Date fechaEmision, double precioTota, Cliente cliente, Ciudad origen, Ciudad destino, Categoria categoria, List<Vuelo> vuelos) {
        this.idBillete = idBillete;
        this.fechaEmision = fechaEmision;
        this.precioTota = precioTota;
        this.cliente = cliente;
        this.origen = origen;
        this.destino = destino;
        this.categoria = categoria;
        this.vuelos = vuelos;
    }

    public int getIdBillete() {
        return idBillete;
    }

    public void setIdBillete(int idBillete) {
        this.idBillete = idBillete;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getPrecioTota() {
        return precioTota;
    }

    public void setPrecioTota(double precioTota) {
        this.precioTota = precioTota;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
