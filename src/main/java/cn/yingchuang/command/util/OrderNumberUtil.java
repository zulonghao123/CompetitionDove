package cn.yingchuang.command.util;

import org.apache.commons.lang.math.RandomUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/8.
 */

public class OrderNumberUtil {

    private static StringBuffer machineCode = new StringBuffer("D1000001");

    private static String date = (new SimpleDateFormat("yyyyMMddHHmmSS").format(new Date())).substring(0, 14);

    private static String ss = date.substring(12, 14);

    public static String getOrderNo(String pid) {

        String md5 = pid + ss + RandomUtils.nextInt(1000000);
        String md5After = null;
        try {
            md5After = MD5.getMD5(md5);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return machineCode + date + md5After;
    }



}
