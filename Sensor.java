
enum TipoSensor_Enum{
    AGUA, LUZ
}

class Sensor {

    /*
    finca
    ubbicacion
    tipo: agua, luz
    precision
    */
    private Finca propiFinca
    private String ubicacion;
    private float precision;
    private TipoSensor_Enum tipo;

    public Finca getPropiFinca() {
        return propiFinca;
    }

    public void setPropiFinca(Finca propiFinca) {
        this.propiFinca = propiFinca;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getPrecision() {
        return precision;
    }

    public void setPrecision(float precision) {
        this.precision = precision;
    }

    public TipoSensor_Enum getTipo() {
        return tipo;
    }

    public void setTipo(TipoSensor_Enum tipo) {
        this.tipo = tipo;
    }
}