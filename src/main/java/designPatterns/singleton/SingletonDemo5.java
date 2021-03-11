package designPatterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: songgx 2021-03-11 14:34
 */
public class SingletonDemo5 {

    /**
     *  volatile 防止多核 cpu 在执行代码的时候，可能存在指令重排，而导致bug
     */
    private static volatile SingletonDemo5 singletonDemo5 = null;

    private SingletonDemo5() {
    }


    /**
     * 双重检查锁
     * @return
     */
    public static SingletonDemo5 getInstance(){
        if(singletonDemo5 == null){
            synchronized (SingletonDemo5.class){
                if(singletonDemo5 ==null){
                    singletonDemo5 = new SingletonDemo5 ();
                }
            }
        }
        return singletonDemo5;
    }
}
