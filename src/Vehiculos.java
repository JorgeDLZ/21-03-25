public class Vehiculos {

    protected String marca;
    protected String modelo;
    protected String anio;
    protected static double precioB;



    public Vehiculos() {

    }

    public Vehiculos(String marca, String modelo, String anio, double precioB) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioB = precioB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public double getPrecioB() {
        return precioB;
    }

    public void setPrecioB(double precioB) {
        this.precioB = precioB;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", precioB=" + precioB +
                '}';
    }
    public static void calcularPrecioFinal(){
        double precioFinal = precioB+(precioB*0.10);
        System.out.println("PRECIO FINAL: "+ precioFinal);
    }

    public  void mostrarInfo(){

        System.out.println("MARCA: "+ marca);
        System.out.println("MODELO: "+ modelo);
        System.out.println("AÑO: "+ anio);
        System.out.println("PRECIO BASE: "+precioB);

    }
}
