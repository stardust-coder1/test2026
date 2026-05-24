package test5_24;

import java.util.Scanner;

public class test2 {


        public static int[] twoSum(int[] nums, int target) {
            int[]arr = new int [2];
            for(int i = 0;i<nums.length;i++){
                for(int j = i+1;j<nums.length;j++){
                    if(nums[i]+nums[j]==target){
                        arr[0]= i;
                        arr[1]= j;
                    }
                }
            }
            return arr;
        }
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int target =sc.nextInt();

            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for(int num:twoSum(arr,target)){
                System.out.println(num);

            }

        }

    }



