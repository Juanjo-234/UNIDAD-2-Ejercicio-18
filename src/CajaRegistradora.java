public class CajaRegistradora {
    ImpresoraFiscal impresion;

    public  CajaRegistradora(ImpresoraFiscal impresion){
        this.impresion = impresion;
    }

    void cerrarVenta(Factura factura){
        System.out.println("Procesando y cerrando factura");
        impresion.imprimirDocumento(factura);
        System.out.println("Venta cerrada con exito");
    }
}
