public class ItemFactura {
    String descripcion;
    int cantidad;
    double precioUnitario;


    public ItemFactura(String descripcion, int cantidad, double precioUnitario){
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }

    String getDescripcion(){
        return descripcion;
    }

    int getCantidad(){
        return cantidad;
    }

    double getPrecioUnitario(){
        return precioUnitario;
    }

    public double getSubtotal() {
        return cantidad * precioUnitario;
    }

}
