package com.offer.algorithm.bishi.bytedancer;

import com.sun.jmx.snmp.internal.SnmpSubSystem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pcwl
 * @date 2019/8/11 20:01
 * @description
 */
public class aa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] times = new Integer[n];
        for(int i = 0; i < n; i++){
            int h = in.nextInt();
            int m = in.nextInt();
            times[i] = h * 60 + m;
        }
        int cost = in.nextInt();
        int endH = in.nextInt();
        int endM = in.nextInt();
        int end = endH * 60 + endM;
        Arrays.sort(times, ((o1, o2) -> o2- o1));
        int i = 0;
        for(; i < n; i++){
            if((times[i] + cost) <= end){
                break;
            }
        }
        int resH = times[i] / 60;
        int resM = times[i] % 60;
        System.out.println(resH + " " +resM);
    }

}
