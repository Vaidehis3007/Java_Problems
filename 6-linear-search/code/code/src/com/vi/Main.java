package com.vi;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int target = 6               ;
        int ans = linearSearch2(nums, target);
        System.out.println(ans);
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length==0){
            return false;
        }

        for(int element : arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }


    // search the target and return the element itself
    static int linearSearch2(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        //run a for loop
        for(int element : arr){
            if(element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE; //returning Integer.MAX_VALUE here because -1 can be one of the element
    }

    // search in the array: return the index if item found
    //otherwise if not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int index = 0; index <arr.length; index++){
            if(arr[index]==target){
                return index;
            }
        }
        // this line will execute if none of the return statements above have been not executed
        //hence target not found
        return -1;
        }
    }

