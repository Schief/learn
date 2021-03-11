package designPatterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description: 懒汉模式1
 *
 * @author: songgx 2021-03-11 10:49
 */
public class SingletonDemo2 {

    private static SingletonDemo2 singletonDemo2 = null;

    private SingletonDemo2( ) {
    }

    /**
     * 高并发的时候此处有问题
     * @return
     */
    public static SingletonDemo2 getInstance(){
        if(singletonDemo2 == null){
            singletonDemo2 = new SingletonDemo2 ();
        }
        return singletonDemo2;
    }
}
