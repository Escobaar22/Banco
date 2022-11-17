public class VerFactura {
    public static void main(String[] args) {
        Factura factura1=new Factura("09346",0);
        Factura factura2=new Factura("42839",0);

        factura1.emision(60);
        factura2.emision(2333);

        System.out.println(factura1);
        System.out.println(factura2);
    }
}
