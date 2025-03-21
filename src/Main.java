import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op, i;
        String vehiculo;

        List<Vehiculos> lstVehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("""
                    Menú
                    1. AÑADIR VEHICULO
                    2. LISTA DE VEHICULOS
                    3. PRECIO FINAL
                    4. SALIR
                    
                    """);
            op = scanner.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("""
                            1. MOTOCICLETA
                            2. AUTOMOVIL
                            """);
                    op = scanner.nextInt();
                    switch (op) {
                        case 1 -> {
                            System.out.println("MOTOCICLETA");
                            System.out.println("MARCA:  ");
                            String marca = scanner.next();
                            System.out.println("MODELO: ");
                            String modelo = scanner.next();
                            System.out.println("AÑO: ");
                            String anio = scanner.next();
                            System.out.println("PRECIO BASE: ");
                            double precioB = scanner.nextDouble();
                            System.out.println("CILINDRAJE");
                            String cilindraje = scanner.next();

                            lstVehiculos.add(new Motos(marca, modelo, anio, precioB, cilindraje));
                        }
                        case 2 -> {
                            System.out.println("AUTOMOVIL");
                            System.out.println("MARCA:  ");
                            String marca = scanner.next();
                            System.out.println("MODELO: ");
                            String modelo = scanner.next();
                            System.out.println("AÑO: ");
                            String anio = scanner.next();
                            System.out.println("PRECIO BASE: ");
                            double precioB = scanner.nextDouble();
                            System.out.println("NUMERO DE PUERTAS");
                            String numeroPuertas = scanner.next();

                            lstVehiculos.add(new Autos(marca, modelo, anio, precioB, numeroPuertas));

                        }
                    }


                }
                case 2 -> {
                    if (lstVehiculos.isEmpty()) {
                        System.out.println("\nNo hay vehiculos en la lista\n");
                    } else {
                        System.out.println("\n=== Lista de vehiculos ===");
                        for (i = 0; i < lstVehiculos.size(); i++) {
                            System.out.println("Vehiculo " + (i + 1) + ":");
                            lstVehiculos.get(i).mostrarInfo();
                            System.out.println(lstVehiculos);
                        }
                    }
                }
                case 3-> {
                    if (lstVehiculos.isEmpty()) {
                        System.out.println("\nNo hay vehiculos en la lista\n");
                    } else {
                        System.out.println("\n=== Lista de vehiculos ===");
                        for (i = 0; i < lstVehiculos.size(); i++) {
                            System.out.println("Vehiculo " + (i + 1) + ":");
                            System.out.println("PRECIO FINAL: ");
                            Vehiculos.calcularPrecioFinal();
                        }
                    }
                }
                default -> {
                    System.out.println("Opcion no valida");

                }


            }
        }while (op!=4);
    }
}