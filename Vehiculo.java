public class Vehiculo {
    private String placa;
    private double kilometraje;
    private boolean disponible;
    private Chofer choferAsignado;

    public Vehiculo(String placaIngresada, double kilometrajeInicial) {
        placa = placaIngresada;
        kilometraje = kilometrajeInicial;
        disponible = true;
        choferAsignado = null;
    }

    public String getPlaca() {
        return placa;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean estadoDisponible) {
        disponible = estadoDisponible;
    }

    public Chofer getChoferAsignado() {
        return choferAsignado;
    }

    public void setChoferAsignado(Chofer nuevoChofer) {
        choferAsignado = nuevoChofer;
    }

    public boolean coincideConPlaca(String placaBuscada) {
        return placa.equalsIgnoreCase(placaBuscada);
    }
}
