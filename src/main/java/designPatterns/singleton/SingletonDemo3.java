package designPatterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: songgx 2021-03-11 14:29
 */
public class SingletonDemo3 {

    private static SingletonDemo3 singletonDemo3 = null;

    private SingletonDemo3() {
    }

    public static synchronized SingletonDemo3 getInstance(){
        if(singletonDemo3 == null){
            singletonDemo3 = new SingletonDemo3 ();

        }
        return singletonDemo3;
    }
}
