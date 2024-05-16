package aed;

class ArregloRedimensionableDeRecordatorios implements SecuenciaDeRecordatorios {
    private Recordatorio[] _ArregRecordatorios;

   

    public ArregloRedimensionableDeRecordatorios() {
        _ArregRecordatorios = new Recordatorio[0];
   
    }

    public ArregloRedimensionableDeRecordatorios(ArregloRedimensionableDeRecordatorios vector) {
        _ArregRecordatorios = vector.copiar()._ArregRecordatorios;
    }

    public int longitud() {
        int res = 0;
        while (res < this._ArregRecordatorios.length && this._ArregRecordatorios[res] != null) {
            res++;
        }
        return res;
    }
        
 
    
    public void agregarAtras(Recordatorio i) {
        int espacio = this.longitud();
        if (espacio < this._ArregRecordatorios.length) {
            this._ArregRecordatorios[espacio] = i;
        } else {
            Recordatorio[] nuevoRecordatorio = new Recordatorio[espacio + 1];
            for (int j = 0; j < this._ArregRecordatorios.length; j++) {
                nuevoRecordatorio[j] = this._ArregRecordatorios[j];
            }
            nuevoRecordatorio[espacio] = i;
            this._ArregRecordatorios = nuevoRecordatorio;
            
        }

    }

    public Recordatorio obtener(int i) {
        return this._ArregRecordatorios[i];
    }

    public void quitarAtras() {
        int espacio = this.longitud();
        int len = this._ArregRecordatorios.length;

        if (espacio > 0) {
            Recordatorio[] nuevoRec = new Recordatorio[len];
        for (int i = 0; i < espacio - 1; i++) {
            nuevoRec[i] = this._ArregRecordatorios[i];
        }
            
        this._ArregRecordatorios = nuevoRec;
    }
  }
         
    

    public void modificarPosicion(int indice, Recordatorio valor) {
        this._ArregRecordatorios[indice] = valor;
    }

    public ArregloRedimensionableDeRecordatorios copiar() {
        int espacio = longitud();
        int len = this._ArregRecordatorios.length;

        ArregloRedimensionableDeRecordatorios copiaVector = new ArregloRedimensionableDeRecordatorios();
        copiaVector._ArregRecordatorios = new Recordatorio[len];

        for (int i = 0; i < espacio; i++) {
            copiaVector.agregarAtras(this._ArregRecordatorios[i]);
        }
        return copiaVector;
        
    }    
    
       
    }
    