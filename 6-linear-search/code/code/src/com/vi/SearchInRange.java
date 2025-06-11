package com.vi;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {45,67,35,78,33,68,25};
        int target = 33;
        System.out.println(linearSearch(arr, target,2,5));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=start; index<=end;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
