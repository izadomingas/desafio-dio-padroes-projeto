package one.digitalinnovation.gof.strategy;
/**
 * @author IzaideTenutes
 */
public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}
