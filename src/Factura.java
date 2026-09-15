import java.util.ArrayList;
import java.util.List;

public class Factura {
    String nombreCliente;
    String numeroFactura;
    List<ItemFactura> items;

    public  Factura(String nombreCliente, String numeroFactura, List<ItemFactura> items){
        this.nombreCliente = nombreCliente;
        this.numeroFactura = numeroFactura;
        this.items = items;
    }

    public double calcularTotal(){
        double total = 0;
        for(ItemFactura item : items){
            total += item.getSubtotal();
        }
        return total;
    }
}
