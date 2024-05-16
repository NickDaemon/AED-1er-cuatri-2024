package aed;

public class Recordatorio {
    private String _mensaje;
    private Fecha _fecha;
    private Horario _horario;

    public Recordatorio(String mensaje, Fecha fecha, Horario horario) {
        _mensaje = mensaje;
        _fecha = new Fecha(fecha.dia(),fecha.mes());
        _horario = new Horario(horario.hora(),horario.minutos());
    }

    public Horario horario() {
        Horario horario = new Horario(this._horario.hora(),this._horario.minutos());
        return horario;
    }

    public Fecha fecha() {
        Fecha fecha = new Fecha(this._fecha.dia(),this._fecha.mes());
        return fecha;
    }

    public String mensaje() {
        return this._mensaje;
    }

    @Override
    public String toString() {
        return this._mensaje + " @ "  + this._fecha + " " +  this._horario;
    }

    @Override
    public boolean equals(Object otro) {
        if (otro.getClass() == this.getClass()){
            Recordatorio otroRec = (Recordatorio) otro;
            return otroRec._fecha.equals(this._fecha) && otroRec._horario.equals(this._horario) && otroRec._mensaje.equals(this._mensaje);
        } else {
            return false;
        }
    }

}
