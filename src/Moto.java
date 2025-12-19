public class Moto extends Vehiculo {
    public Moto(String matricula, String fechaHora,  String horaEntrada) {
        super(matricula, fechaHora, horaEntrada);
        this.tipo = "Moto";
    }
    @Override
    public double Calculatarifa(int HoraEntrada) {
        double total = tarifaBase * HoraEntrada;
        return total * 0.8;
    }
}
