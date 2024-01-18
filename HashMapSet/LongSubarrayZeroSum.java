
//ps Longest Subarray Zero Sum

import java.util.HashMap;

public class LongSubarrayZeroSum {

    public static  int res(int[] arr){
        int sum=0;
        int len=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(hm.containsKey(sum)){
                len=Math.max(len,j-hm.get(sum));
            } else if (sum==0) {
                len=j+1;
            }
            else{
                hm.put(sum,j);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int arr[]={1 ,-1 ,2 ,-2};

        int length=res(arr);
        System.out.println("longest length of  subarry with sum zero "+length);
    }
}
