package modelo;

import java.time.LocalDate;

/**
 *
 * @author EVELIN
 */
public class QuejasModelo {
    private int id;
    private ClienteModelo cliente;
    private ProductosModelo producto;
    private String descripcion;
    private String estado; // Ej.: "Pendiente", "Resuelto", "No Procede"
    private String accionTomada;
    private LocalDate fechaRegistro;

    public QuejasModelo(int id, ClienteModelo cliente, ProductosModelo producto, String descripcion, String estado, String accionTomada, LocalDate fechaRegistro) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.descripcion = descripcion;
        this.estado = estado;
        this.accionTomada = accionTomada;
        this.fechaRegistro = fechaRegistro;
    }

    public QuejasModelo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClienteModelo getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModelo cliente) {
        this.cliente = cliente;
    }

    public ProductosModelo getProducto() {
        return producto;
    }

    public void setProducto(ProductosModelo producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getAccionTomada() {
        return accionTomada;
    }

    public void setAccionTomada(String accionTomada) {
        this.accionTomada = accionTomada;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    
}
