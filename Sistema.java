public class Sistema {
    private Vehiculo[] vehiculos;

    public Sistema() {
        vehiculos = new Vehiculo[5];

        vehiculos[0] = new Vehiculo("ABC1234", 45000.0);
        vehiculos[1] = new Vehiculo("DEF5678", 12000.5);
        vehiculos[2] = new Vehiculo("GHI9012", 89000.0);
        vehiculos[3] = new Vehiculo("JKL3456", 34000.8);
        vehiculos[4] = new Vehiculo("MNO7890", 67000.2);
    }

    public void mostrarUnidadesDisponibles() {
        boolean hayDisponibles = false;

        System.out.println("\n--- UNIDADES DISPONIBLES ---");

        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].getDisponible()) {
                imprimirDetalleVehiculo(vehiculos[i]);
                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {
            System.out.println("No hay unidades disponibles en este momento.");
        }
    }

    public void asignarChofer(String placaBuscada, Chofer nuevoChofer) {
        Vehiculo vehiculoEncontrado = buscarVehiculoPorPlaca(placaBuscada);

        if (vehiculoEncontrado == null) {
            System.out.println("\n>> Error: No se encontró la unidad con placa " + placaBuscada + ".");
            return;
        }

        if (!vehiculoEncontrado.getDisponible()) {
            System.out.println("\n>> Error: La unidad " + placaBuscada + " ya se encuentra ocupada.");
            return;
        }

        vehiculoEncontrado.setChoferAsignado(nuevoChofer);
        vehiculoEncontrado.setDisponible(false);

        System.out.println("\n>> ¡Asignación exitosa!");
        System.out.println("Chofer " + nuevoChofer.getNombreCompleto()
                           + " asignado a la unidad " + placaBuscada + ".");
    }

    private Vehiculo buscarVehiculoPorPlaca(String placaBuscada) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] != null && vehiculos[i].coincideConPlaca(placaBuscada)) {
                return vehiculos[i];
            }
        }
        return null;
    }

    private void imprimirDetalleVehiculo(Vehiculo vehiculo) {
        System.out.println("Placa: " + vehiculo.getPlaca()
                           + " | Kilometraje: " + vehiculo.getKilometraje()
                           + " km | Estatus: Disponible");
    }
}
