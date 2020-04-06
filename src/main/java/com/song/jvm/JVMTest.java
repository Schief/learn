package com.song.jvm;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: songgx 2020-04-06 下午7:15
 */
public class JVMTest {

    public static void main(String[] args) {
        int i = 8;
        int j = 200;
        j = j++;
        //i = i++;
        i = ++i;
        System.out.println (i);
        System.out.println (j);
    }
}
