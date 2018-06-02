package pregunta5;

public class AssignBooleanImplicity {

    public boolean debePagarImpuestoDirty(int monto, int tasa) {
        boolean debePagar = false;
        if (tasa > 10 && monto < 100) {
            debePagar = true;
        }
        if (tasa > 10 && monto > 100) {
            debePagar = false;
        }
        return debePagar;
    }

    public boolean debePagarImpuestoClean(int monto, int tasa) {
        return (tasa > 10 && monto < 100);
    }
}
