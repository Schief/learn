package designPatterns.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description: 现金贷模式
 *
 * @author: songgx 2021-03-10 17:55
 */
public class XJD implements Strategy{


    @Override
    public void operate() {
        System.out.println ("现金贷模式具体实现");
    }
}
