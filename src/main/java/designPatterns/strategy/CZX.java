package designPatterns.strategy;

/**
 * Created with IntelliJ IDEA.
 * Description: 纯征信模式
 *
 * @author: songgx 2021-03-10 17:57
 */
public class CZX implements Strategy{

    @Override
    public void operate() {
        System.out.println ("纯征信模式具体实现");
    }
}
