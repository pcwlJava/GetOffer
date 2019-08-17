package com.offer.algorithm.mianshi.shunfeng;

/**
 * @author pcwl
 * @date 2019/8/13 0:48
 * @description 判断一个数是否为2的整数次幂
 */
public class IsPowerOfTwo {

    /**
     * 2的整数次幂：首位为 1，其他位为 0
     */
    public static boolean isPowerOfTwo1(int n){
        if( n > 0 && (n & (n - 1)) == 0){
            return true;
        }else {
            return false;
        }
    }

    public static boolean isPowerOfTwo2(int n){
        String str = Integer.toBinaryString(n);
        if(str.lastIndexOf('1') == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo1(0));
    }
}
