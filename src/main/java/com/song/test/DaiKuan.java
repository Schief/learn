package com.song.test;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: songgx 2021-02-04 10:58
 */
public class DaiKuan {

    public static BigDecimal YUE = new BigDecimal ("204393");

    public static void main(String[] args) {
        BigDecimal meiYue = new BigDecimal ("14387");
        BigDecimal nowMeiYueJiaoNa = new BigDecimal ("10646");
        boolean flag = true;
        for (int i = 1; i <= 72; i++) {
            YUE = YUE.subtract (meiYue);
            YUE = YUE.add (nowMeiYueJiaoNa);
            if (i % 12 == 0) {
                nowMeiYueJiaoNa = nowMeiYueJiaoNa.add (new BigDecimal ("500"));
            }
            System.out.println ("第 " + i+" 期，月缴纳：" + nowMeiYueJiaoNa + "  应还 " + meiYue + "   余额：" + YUE +
                    "元");
            if (YUE.compareTo (BigDecimal.ZERO) < 0 && flag) {
                System.out.println ("第" + i + " 个月余额已经用完");
                flag = false;
            }
        }
    }
}
