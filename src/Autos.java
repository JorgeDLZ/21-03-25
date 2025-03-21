public class Autos extends Vehiculos{

    protected String numeroPuertas;

    public Autos(String marca, String modelo, String anio, double precioB, String numeroPuertas) {
        super(marca, modelo, anio, precioB);
        this.numeroPuertas = numeroPuertas;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Autos{" +
                "numeroPuertas='" + numeroPuertas + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio='" + anio + '\'' +
                ", precioB=" + precioB +
                '}';
    }

    @Override
    public void mostrarInfo(){
            System.out.println("MARCA: "+ marca);
            System.out.println("MODELO: "+ modelo);
            System.out.println("AÑO: "+ anio);
            System.out.println("PRECIO BASE: "+precioB);
            System.out.println("NUMERO DE PUERTAS: "+numeroPuertas);
        }
    }


