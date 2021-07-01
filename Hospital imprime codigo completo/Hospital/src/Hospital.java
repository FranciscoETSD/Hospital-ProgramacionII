public class Hospital {
    private String codHospital;
    private String nombre;
    private String ciudad;
    private String telefono;
    private String servicios;
    private String director;

    public Hospital(String codHospital, String nombre, String ciudad, String telefono, String servicios, String director) {
        this.setCodHospital(codHospital);
        this.setNombre(nombre);
        this.setCiudad(ciudad);
        this.setTelefono(telefono);
        this.setServicios(servicios);
        this.setDirector(director);
    }


    @Override
    public String toString() {
        return "Hospital{" +
                "codHospital='" + getCodHospital() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", ciudad='" + getCiudad() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", servicios='" + getServicios() + '\'' +
                ", director='" + getDirector() + '\'' +
                '}';
    }


    public String getCodHospital() {
        return codHospital;
    }

    public void setCodHospital(String codHospital) {
        this.codHospital = codHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
