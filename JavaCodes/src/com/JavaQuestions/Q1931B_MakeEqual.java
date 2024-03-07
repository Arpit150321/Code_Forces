package com.JavaQuestions;

import java.util.Scanner;

public class Q1931B_MakeEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        int container_number = 0;
        while (test_cases > 0){
            container_number = sc.nextInt();
            int sum = 0;
            int water_amount[] = new int[container_number];
            for(int i = 0; i < container_number; i ++){
                water_amount[i] = sc.nextInt();
                sum += water_amount[i];
            }
            int average = sum/container_number;
            System.out.println(MakeEqual(water_amount, container_number, average));
            test_cases --;
        }
    }
    public static String MakeEqual(int[] arr, int n, int avg){
        StringBuilder result = new StringBuilder("NO");
        int extra = 0;
        for(int i = 0; i < n; i ++){
            if(arr[i] >= avg){
                extra += (arr[i] - avg);
            }
            else{
                int pour_amount = avg - arr[i];
                if (extra >= pour_amount){
                    extra -= pour_amount;
                }
                else{
                    return result.toString();
                }
            }
        }
        if(extra == 0){
            result.replace(0, 2, "YES");
            return result.toString();
        }
        return result.toString();
    }
}
