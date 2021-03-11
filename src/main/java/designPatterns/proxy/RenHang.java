package designPatterns.proxy;

/**
 * Created with IntelliJ IDEA.
 * Description: 人行查询征信
 *
 * @author: songgx 2021-03-10 18:30
 */
public class RenHang implements RiskManagement{

    @Override
    public void riskDiscern() {
        System.out.println ("查询人行征信报告");
    }
}

