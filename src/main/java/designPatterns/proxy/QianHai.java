package designPatterns.proxy;

/**
 * Created with IntelliJ IDEA.
 * Description: 前海
 *
 * @author: songgx 2021-03-11 10:43
 */
public class QianHai implements RiskManagement{

    @Override
    public void riskDiscern() {
        System.out.println ("前海征信查询");
    }
}
