public class Chofer {
    private String nombreCompleto;
    private String licencia;

    public Chofer(String nombre, String numeroLicencia) {
        nombreCompleto = nombre;
        licencia = numeroLicencia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nuevoNombre) {
        nombreCompleto = nuevoNombre;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String nuevaLicencia) {
        licencia = nuevaLicencia;
    }
}
