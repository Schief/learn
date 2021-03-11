package com.song.jvm.methods;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: songgx 2020-11-09 上午11:32
 */
public class FatherDemo2 {

    public String call(){
        System.out.println ("FatherDemo2 --> call");
        return "FatherDemo2-call";
    }

    public int call(String arg){
        return 1;
    }
}
