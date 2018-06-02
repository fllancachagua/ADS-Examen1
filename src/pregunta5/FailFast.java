package pregunta5;

public class FailFast {

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
        try {
        if (valorMaximo < 10 && valorMinimo > 0 && (valorMaximo - valorMinimo) > 10) throw new Exception();
        if (valorMaximo < 10 && valorMinimo > 0 && (valorMaximo - valorMinimo) > 3)  throw new Exception();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

}
