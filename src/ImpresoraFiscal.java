import java.util.List;

public class ImpresoraFiscal {

    void imprimirDocumento(Factura factura){
        System.out.println("====================================");
        System.out.println("              Factura               ");
        System.out.println("====================================");
        System.out.println("Numero de factura : " + factura.numeroFactura);
        System.out.println("Nombre del cliente: " + factura.nombreCliente);
        System.out.println("----------------------------------------");
        System.out.println("Cant | Descripción        | P.Unit | Subtotal");
        System.out.println("----------------------------------------");

for(ItemFactura item : factura.items){
    System.out.println(item.cantidad + item.descripcion + item.precioUnitario + item.getSubtotal());
}
        System.out.println("----------------------------------------");
        System.out.printf("TOTAL A PAGAR:                      $%.2f\n", factura.calcularTotal());
        System.out.println("========================================");
    }
}
