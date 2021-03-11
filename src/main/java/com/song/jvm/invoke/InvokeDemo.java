package com.song.jvm.invoke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: songgx 2020-11-09 下午5:58
 */
public class InvokeDemo {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> clazz  = Class.forName ("com.song.jvm.invoke.Demo");
        clazz.getMethods ();
        Object obj = clazz.newInstance ();
        Method method = clazz.getMethod ("foo",String.class);
        for (int i = 0; i < 16; i++) {
            method.invoke (obj,Integer.toString (i));
        }

    }
}
