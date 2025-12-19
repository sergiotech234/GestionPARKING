public class Coche extends Vehiculo {
    public Coche(String matricula, String fechaHora, String horaEntrada) {
        super(matricula, fechaHora, horaEntrada);
        this.tipo = "Coche";
    }

    @Override
    public double Calculatarifa(int HoraEntrada) {
        return tarifaBase*HoraEntrada;
    }
}
