package aed;

public class Fecha {
    private int _dia;
    private int _mes;
    public Fecha(int dia, int mes) {
        _dia = dia;
        _mes = mes;
    }

    public Fecha(Fecha fecha) {
        fecha._dia = _dia;
        fecha._mes = _mes;
    }

    public Integer dia() {
        return _dia;
    }

    public Integer mes() {
        return _mes;
    }

    public String toString() {
        return _dia + "/" + _mes;
    }

    @Override
    public boolean equals(Object otra) {
        if (otra.getClass() == this.getClass()){
            Fecha otraFecha = (Fecha) otra;
            return otraFecha._dia == this._dia && otraFecha._mes == _mes;
        } else {
            return false;
        }
    }

    public void incrementarDia() {
        if (_dia < diasEnMes(_mes)) {
            _dia ++;
        } else {
            _dia = 1;
            _mes++;
            if (_mes > 12) {
                _mes = 1;
            }
        }
    }

    private int diasEnMes(int mes) {
        int dias[] = {
                // ene, feb, mar, abr, may, jun
                31, 28, 31, 30, 31, 30,
                // jul, ago, sep, oct, nov, dic
                31, 31, 30, 31, 30, 31
        };
        return dias[mes - 1];
    }

}
