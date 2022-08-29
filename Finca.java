public class Finca {
/*
    nombre
    ciudad
    area m2
    telefono
 */
    private String nombre;
    private String cuidad;
    private float area;
    private String telefono;

    public Finca(String nombre, String cuidad, float area, String telefono) {
        this.nombre = nombre;
        this.cuidad = cuidad;
        this.area = area;
        this.telefono = telefono;
    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
