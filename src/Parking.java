public class Parking {
    private Vehiculo [] plazas;
    private int capacidad;

    public Parking(int capacidad) {
        this.capacidad =capacidad;
        plazas = new Vehiculo[capacidad];
    }
   //Esto es el registro de entrada en el cual se almacenan las matriculas incorrectas y las repetidas
    public void resgistrarEntrada(Vehiculo v)throws PakingLlenoException,MatriculaInvalidaException,MatriculaInvalidaException{
        if (v.getMatricula()==null || v.getMatricula().isEmpty()){
            throw new MatriculaInvalidaException("Matricula Invalida");
        }
        for(Vehiculo veh:plazas){
            if(veh != null && veh.getMatricula().equals(v.getMatricula())){
                throw new MatriculaRepetidaException("Matricula repetida");
            }
        }
        for(int i=0;i<capacidad;i++) {
            if (plazas[i] == null) {
                plazas[i] = v;
                return;
            }
        }
        throw new PakingLlenoException("El Parking esta lleno");
}
//Esto gauarda las salidas del parking y las plazas 
    public double registrarSalida(String matricula, int horas) throws VehiculoNoEncontradoException{
        for (int i = 0; i<capacidad;i++){
            if( plazas[i] != null && plazas[i].getMatricula().equals(matricula)) {
                Vehiculo v = plazas[i];
                plazas[i] = null;

                return v.Calculatarifa(horas);
            }
        }
        throw new VehiculoNoEncontradoException("Vehiculo no encontrado");
    }
    public int plazaLibres() {
        int libres = 0;
        for(Vehiculo v:plazas) if (v== null) libres++;
        return libres;
    }
    public int plazaocupdadas() {
        return capacidad- plazaLibres();
    }
    public void listarVehiculos(){
        for(Vehiculo v:plazas){
            if (v!=null) System.out.println(v);
        }
    }
}
