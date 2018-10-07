package com.imooc.utils;

import java.util.Random;

/**
 * Created by 廖师兄
 * 2017-06-11 19:12
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {      // synchronized 多线程并发的情况
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;   //生成六位随机数

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
