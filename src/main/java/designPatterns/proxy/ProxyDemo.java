package designPatterns.proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: songgx 2021-03-10 18:34
 */
public class ProxyDemo {

    public static void main(String[] args) {
        XD xd = new XD ();
        //直接对外暴露XD相关功能，外部无法感知具体的业务逻辑
        xd.riskDiscern ();

        XD xd1 = new XD (new QianHai ());
        xd1.riskDiscern ();
    }
}
