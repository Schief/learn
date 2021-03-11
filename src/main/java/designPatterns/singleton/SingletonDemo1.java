package designPatterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description: 饿汉模式
 *
 * @author: songgx 2021-03-11 10:46
 */
public class SingletonDemo1 {

    /**
     * 类初始化的时候就实例化好，随时拿来用
     */
    private final static SingletonDemo1 singletonDemo1 = new SingletonDemo1();


    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstance(){
        return singletonDemo1;
    }
}
