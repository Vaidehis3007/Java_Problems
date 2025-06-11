package com.vi;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Vaidehi";
        char target = 'i';
        System.out.println(search3(name,target));
    }

    static boolean search3(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }


    static boolean search2(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for(int i=0;i<str.length();i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }

        for(int elements : str.toCharArray()){
            if(elements==target){
                return true;
            }
        }
        return false;
    }
}
