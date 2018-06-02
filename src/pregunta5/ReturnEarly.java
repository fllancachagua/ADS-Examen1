package pregunta5;

public class ReturnEarly {

    public String calcularEstadoUmbralDirty(int valorMaximo, int valorMinimo) {
        String resultado = "OK";
        if (valorMaximo < 10 && valorMinimo > 0 && (valorMaximo - valorMinimo) > 10) {
            resultado = "ERROR1";
        } else if (valorMaximo < 10 && valorMinimo > 0 && (valorMaximo - valorMinimo) > 3) {
            resultado = "ERROR2";
        } else {
            resultado = "ERROR3";
        }
        return resultado;
    }
    public String calcularEstadoUmbralClean(int valorMaximo, int valorMinimo) {
        String resultado = "OK";
        if (valorMaximo < 10 && valorMinimo > 0 && (valorMaximo - valorMinimo) > 10) return "ERROR1";
        if (valorMaximo < 10 && valorMinimo > 0 && (valorMaximo - valorMinimo) > 3)  return  "ERROR2";
        return resultado;
    }

}
