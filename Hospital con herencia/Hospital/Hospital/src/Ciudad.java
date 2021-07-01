public class Ciudad {
    String codCiudad;
    String nombre;

    public Ciudad(String codCiudad, String nombre) {
        this.codCiudad = codCiudad;
        this.nombre = nombre;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
