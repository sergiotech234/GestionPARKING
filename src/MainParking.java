public class MainParking {
    public static void main(String[] args) {
        Parking parking =new Parking(25);

        try {
            parking.resgistrarEntrada(new Coche("1234ABC", "10/12/2025", "10:00"));
            parking.resgistrarEntrada(new Moto("9999ZZZ", "10/12/2025", "10:30"));
            parking.resgistrarEntrada(new Coche("5555TTT", "10/12/2025", "11:00"));

            System.out.println("======== Estado PARKING ========");
            parking.listarVehiculos();

            System.out.println("\nPlazas ocupadas: " +parking.plazaocupdadas());
            System.out.println("Plazas Libres: " +parking.plazaLibres());

            System.out.println("Salidas del vehiculo 9999ZZZ (3 horas)...");
            double precio =parking.registrarSalida("9999ZZZ", 3);
            System.out.println("Precio final: " +precio+ "€");

            System.out.println("\n==== Estado tras saldia ====");
            parking.listarVehiculos();
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}