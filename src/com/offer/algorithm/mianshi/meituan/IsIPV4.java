package com.offer.algorithm.mianshi.meituan;

/**
 * @author pcwl
 * @date 2019/8/15 0:46
 * @description 判断一个字符串是否是合法的IPV4
 */
public class IsIPV4 {

    public static boolean isIPV4(String str){
        if(str == null || str.length() == 1){
            return false;
        }
        // 注意：用 . 进行分割的时候需要用 \\ 转义
        String[] parts = str.split("\\.");
        if(parts.length != 4){
            return false;
        }
        for(int i = 0; i < parts.length; i++){
            if(Integer.valueOf(parts[i]) < 0 || Integer.valueOf(parts[i]) > 255){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIPV4("111.111.111.111"));
        System.out.println(isIPV4("-1.111.111.111"));
        System.out.println(isIPV4("1111.111.111.111"));
    }
}
