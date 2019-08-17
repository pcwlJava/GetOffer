package com.offer.algorithm.bishi.bytedancer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pcwl
 * @date 2019/8/11 18:48
 * @description
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] time = new int[N];
        for(int i = 0; i < N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a * 60 + b;
            time[i] = c;
        }
        Arrays.sort(time);
        int Cost = sc.nextInt();
        int hClassTime = sc.nextInt();
        int mClassTime = sc.nextInt();
        int ClassTime = hClassTime * 60 + mClassTime;
        int getUp1 = ClassTime - Cost;
        for(int i = time.length - 1; i >= 0; i--){
            if(getUp1 >= time[i]){
                int h = time[i] / 60;
                int m = time[i] % 60;
                System.out.println(h  + " " + m);
                break;
            }
        }
    }
}
