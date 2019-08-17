package com.offer.algorithm.bishi.bytedancer;

import java.util.Scanner;

/**
 * @author pcwl
 * @date 2019/8/11 19:50
 * @description
 */
public class Second {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        char[] chars = s.toCharArray();
        int[] res = new int[n+k-1];
        for(int i= 0; i<res.length;i++){
            res[i] = 0;
        }
        int total = 0;
        boolean isOuShu = true;
        for(int i = k - 1, j = 0; i < res.length; i++, j++){
            isOuShu = total % 2 == 0 ? true : false;
            if(chars[j] == '1'){
                if(isOuShu){
                    res[i] = 1;
                }else {
                    res[i] = 0;
                }
            }
            if(chars[j] == '0'){
                if(isOuShu){
                    res[i] = 0;
                }else {
                    res[i] = 1;
                }
            }
            total = total + res[i] - res[i - k + 1];
        }
        for(int i = k - 1; i < res.length; i++){
            System.out.print(res[i]);
        }
        System.out.println();
    }
}
