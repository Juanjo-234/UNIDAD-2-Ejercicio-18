//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    List<ItemFactura> listaItems = Arrays.asList(
            new ItemFactura(" Café Espresso ", 2, 1.50),
            new ItemFactura(" Medialuna de Manteca ", 4, 0.75),
            new ItemFactura(" Jugo de Naranja Natural ", 1, 2.50)
    );

    Factura miFactura = new Factura("A-0001-00000123", "María Gómez", listaItems);

    ImpresoraFiscal miImpresora = new ImpresoraFiscal();
    CajaRegistradora miCaja = new CajaRegistradora(miImpresora);
    miCaja.cerrarVenta(miFactura);

}
