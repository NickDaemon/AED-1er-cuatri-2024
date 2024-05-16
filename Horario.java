package aed;

public class Horario {
    private int _hora;
    private int _minutos;

    public Horario(int hora, int minutos) {
        _hora = hora;
        _minutos = minutos;
    }

    public int hora() {
        return this._hora;
    }

    public int minutos() {
        return this._minutos;
    }

    @Override
    public String toString() {
        return this._hora + ":" + this._minutos;
    }

    @Override
    public boolean equals(Object otro) {
        if (otro.getClass() == this.getClass()) {
            Horario otroHorario = (Horario) otro;
            return otroHorario._hora == this._hora && otroHorario._minutos == this._minutos;
        } else {
            return false;
        }
    }

}
