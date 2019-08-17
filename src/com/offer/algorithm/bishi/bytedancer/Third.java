package com.offer.algorithm.bishi.bytedancer;

import java.util.Arrays;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] year = new int[n];
        Integer[] temp = new Integer[n];
        for(int i = 0; i < n; i++){
            int k = in.nextInt();
            year[i] = k;
            temp[i] = k;
        }
        Arrays.sort(temp);
        int[] money = new int[n];
        int thisMoney = 0;
        for(int i = 0; i < temp.length; i++){
            int t = temp[i];
            for(int j = 0; j < year.length; j++){
                if(year[j] == t){
                    int flag = j;
                    int left = 0;
                    if(j - i >= 0){
                        left = money[j - 1];
                    }else{
                        left = 0;
                    }
                    int right = 0;
                    while(flag < year.length && year[flag] == t){
                        flag++;
                    }
                    if(flag == year.length){
                        right = 0;
                    }else{
                        right = money[flag];
                    }
                    thisMoney = Math.max(left, right);
                }
            }
        }
        System.out.println(thisMoney);
    }
}

