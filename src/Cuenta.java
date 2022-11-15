public class Cuenta {
    private String titular;
    private double cantidad;

    //Creamos constructores
    public Cuenta(Cuenta c){
        this.titular=c.titular;
    }
    public Cuenta (String tiular, double cantidad){
        this.titular=titular;
        if (cantidad<0){
            this.cantidad=0;
        } else {
            this.cantidad=cantidad;
        }
    }
}
