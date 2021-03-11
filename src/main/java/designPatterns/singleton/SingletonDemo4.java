package designPatterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: songgx 2021-03-11 14:31
 */
public class SingletonDemo4 {

    private static SingletonDemo4 singletonDemo4 =null;

    private SingletonDemo4() {

    }

    public static SingletonDemo4 getInstance(){
        synchronized (SingletonDemo4.class){
            if(singletonDemo4 == null){
                singletonDemo4 = new SingletonDemo4 ();
            }
        }
        return singletonDemo4;
    }
}
