package vi.Arryas;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3, 23,9,18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0,3));
    }

    static int max(int[] arr){
        if (arr==null || arr.length==0){
            return 0;
        }
        int maxValue = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]> maxValue){
                maxValue =arr[i];
            }
        }
        return maxValue;
    }

    static int maxRange(int[] arr, int start, int end){
        if(end>start){
            return -1;
        }
        if(arr==null || arr.length==0){
            return -1;
        }
        int maxValue = arr[start];
        for(int i=start; i<end; i++){
            if(arr[i]> maxValue){
                maxValue =arr[i];
            }
        }
        return maxValue;
    }
}
