package com.company.A;

import java.util.Scanner;

public class Numbers {

    public static void jTOk(int [] nums,int j , int k, int nEnteredIntegers){
        if (j < 0 || k < 0 ){
            System.out.println("ERROR: j and k can't be negative.");
        }else if ( j > k){
            System.out.println("ERROR: k must be greater then j.");
        }else if (j > nEnteredIntegers || k > nEnteredIntegers){
            System.out.println("ERROR: j and k must be less then the number of entered numbers.");
        }else{
            System.out.print("The element between "+j+" to "+k+":");
            int i = j;
            while(i != k+1){
                System.out.print(nums[i]+" ");
                i++;
            }
            System.out.println("");
        }
    }
    public static void main(String [] args){
        int nums[] = new int[100];
        int nNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Numbers:");
        for (int i = 0 ; i < nums.length ; i++){
            int number = input.nextInt();
            if (number == 0 ){
                break;
            }else{
                nums[i] = number;
                nNumber++;
            }
        }

        System.out.print("The number are :");
        for (int i = 0 ; i < nNumber ; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("");
        System.out.print("Please enter two location j and k:");jTOk(nums, input.nextInt(), input.nextInt(), nNumber);
        System.out.print("Please enter two location j and k:");jTOk(nums, input.nextInt(), input.nextInt(), nNumber);
        System.out.print("Please enter two location j and k:");jTOk(nums, input.nextInt(), input.nextInt(), nNumber);
        System.out.print("Please enter two location j and k:");jTOk(nums, input.nextInt(), input.nextInt(), nNumber);

        nNumber = 0;
        int nums2[] = new int[100];
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] < 0 ){
                nums2[nNumber] = nums[i];
                nNumber++;
            }
        }

        System.out.print("The element of nums2:");
        for (int i = 0 ; i < nNumber ; i++){
            System.out.print(nums2[i]+" ");
        }

    }
}
