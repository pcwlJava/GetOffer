package com.offer.algorithm.dynamicprogram;

/**
 * @author pcwl
 * @date 2019/8/13 8:44
 * @description 一个数组中任意数累加得到目标值
 */
public class SumToAim {

    public static int hasSumToAim(int[] arr, int target){
        if(arr.length == 0 || arr == null){
            return 0;
        }
        return process(arr, 0, 0, target);
    }

    // 每个位置都有要和不要两种情况
    public static int process(int[] arr, int index, int sum, int target){
        if(index == arr.length){
            return sum == target ? 1 : 0;
        }
        return process(arr, index + 1, sum, target) + process(arr, index + 1, sum + arr[index], target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(hasSumToAim(arr, 5));
    }

    /**
     * 动态规划版本
     */
    public static boolean sumToAim(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return false;
        }
        // 构建动态表
        boolean[][] dp = new boolean[arr.length + 1][target + 1];
        // basecase
        for(int i = arr.length, sum = 0; sum <= target; sum++){
            if(sum == target){
                dp[i][sum] = true;
            }else{
                dp[i][sum] = false;
            }
        }
        // 填充dp表:从下往上填充
        for(int i = arr.length - 1; i >= 0; i--){
            for(int sum = target; sum >= 0; sum--){
                if(sum + arr[i] >= target){
                    // 最后一列
                    dp[i][sum] = dp[i + 1][sum];
                }else{
                    dp[i][sum]  = dp[i + 1][sum] || dp[i + 1][sum + arr[i]] ;
                }
            }
        }
    return dp[0][0];
    }
}
