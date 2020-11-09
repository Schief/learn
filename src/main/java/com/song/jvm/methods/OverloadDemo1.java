package com.song.jvm.methods;

/**
 * Description: 重载
 * 重点： Jvm 在重载方法的执行顺序选择时：
 *  1.选择 不考虑自动装箱、拆箱 + 不考虑参数可变
 *  2.选择 考虑自动装箱、拆箱 + 不考虑参数可变
 *  3.选择 考虑自动装箱、拆箱 + 考虑参数可变
 *  按照上述顺序选，只要找到返回相应方法即可。
 *
 */
public class OverloadDemo1 {

    static void invoke(Object obj, Object... args) {
        System.out.println ("to do something 11111");
    }
    static void invoke(String s, Object obj, Object... args) {
        System.out.println ("to do something  2222");
    }

    public static void main(String[] args) {
        invoke(null, 1);    // 调用第二个invoke方法
        invoke(null, 1, 2); // 调用第二个invoke方法
        invoke(null, new Object[]{1}); // 只有手动绕开可变长参数的语法糖，
        // 才能调用第一个invoke方法

    }

}
