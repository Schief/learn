package designPatterns.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description: 金融业务
 *
 * @author: songgx 2021-03-10 17:58
 */
public class JR {

    private Strategy strategy;

    public JR(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 真实业务的具体操作
     */
    public void operate(){
        this.strategy.operate ();
    }
}
