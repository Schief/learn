package designPatterns.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description: 虚拟卡模式
 *
 * @author: songgx 2021-03-10 17:56
 */
public class XNK  implements  Strategy{

    @Override
    public void operate() {
        System.out.println ("虚拟卡模式具体实现");
    }
}
