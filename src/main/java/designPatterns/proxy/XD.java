package designPatterns.proxy;

/**
 * Created with IntelliJ IDEA.
 * Description: XD产品
 *
 * @author: songgx 2021-03-10 18:31
 */
public class XD implements RiskManagement {

    private RiskManagement riskManagement;

    /**
     * 默认 为人行查询
     */
    public XD( ) {
        this.riskManagement = new RenHang ();
    }

    /**
     *
     * @param riskManagement
     */
    public XD(RiskManagement riskManagement) {
        this.riskManagement = riskManagement;
    }

    @Override
    public void riskDiscern() {
            this.riskManagement.riskDiscern ();

    }
}
