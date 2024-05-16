package aed;

public class Agenda {
    private Fecha _fechaActual;
    private ArregloRedimensionableDeRecordatorios[][] _recordatoriosPorMesYDia;

    public Agenda(Fecha fechaActual) {
        _fechaActual = fechaActual;
        _recordatoriosPorMesYDia = new ArregloRedimensionableDeRecordatorios[12][31];
        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 31; dia++) {
                _recordatoriosPorMesYDia[mes][dia] = new ArregloRedimensionableDeRecordatorios();
            }
        }
    }
    


    public void agregarRecordatorio(Recordatorio recordatorio) {
        int mes = recordatorio.fecha().mes() - 1;
        int dia = recordatorio.fecha().dia() - 1;
        this._recordatoriosPorMesYDia[mes][dia].agregarAtras(recordatorio);
        
    }

    @Override
    public String toString() {
        String agenda = _fechaActual + "\n=====";
        int mes = _fechaActual.mes() - 1;
        int dia = _fechaActual.dia() - 1;

        for (int i = 0; i < _recordatoriosPorMesYDia[mes][dia].longitud(); i++) {
            agenda += "\n" + _recordatoriosPorMesYDia[mes][dia].obtener(i); 
            
        }
        return agenda + "\n";
    }
    public void incrementarDia() {
        this._fechaActual.incrementarDia();
        

    }

    public Fecha fechaActual() {
        return this._fechaActual;
    }

}
