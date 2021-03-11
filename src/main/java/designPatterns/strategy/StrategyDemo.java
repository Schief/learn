package designPatterns.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description: demo
 *
 * @author: songgx 2021-03-10 18:00
 */
public class StrategyDemo {

    public static void main(String[] args) {

        JR jr = new JR (new CZX ());
        JR jr1 = new JR (new XNK ());
        JR jr2 = new JR(new XJD ());

        jr.operate ();
        jr1.operate ();
        jr2.operate ();


    }
}
