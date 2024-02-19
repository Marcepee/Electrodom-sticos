public class Lavadora extends Electrodomestico {

    private double precio;
    private boolean aguaCaliente;
    public Lavadora(String marca, double potencia) {
        super("Lavadora", marca, potencia);
        this.precio=0;
        this.aguaCaliente=false;
    }

    public Lavadora(String tipo, String marca, double potencia, double precio, boolean aguaCaliente) {
        super(tipo, marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public double getConsumo(int horas) {
        if (aguaCaliente){
            return getPotencia()*getPotencia()*0.2;
        }else{
            return horas*getPotencia();
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }



    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }
    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }

}
