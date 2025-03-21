public class Motos extends Vehiculos{

    protected String cilindraje;


    public Motos(String marca, String modelo, String anio, double precioB, String cilindraje) {
        super(marca, modelo, anio, precioB);
        this.cilindraje = cilindraje;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Motos{" +
                "cilindraje='" + cilindraje + '\'' +
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
            System.out.println("CILINDRAJE: "+cilindraje);
        }
    }


