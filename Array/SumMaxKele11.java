package atharva.com;
//PS: find maximum sum of k consecutive elements
public class SumMaxKele11 {

    public static void main(String[] args) {
        int[] arr={1,8,30,-5,20,7};
        int max= Integer.MIN_VALUE;
        int k=arr.length/2;

//        Tc O((n-k*k)
//        for(int i=0;i+k-1<arr.length;i++){
//            int sum=0;
//            for(int j=0;j<k;j++){
//                sum+=arr[i+j];
//                max=Math.max(max,sum);
//            }
//        }
//        System.out.println("ans "+max);

//        using Sliding window tech
        int curr_val=0;
         for(int i=0;i<k;i++) {
             curr_val += arr[i];
         }
         max=curr_val;
         for(int i=k;i<arr.length;i++){
             curr_val+=arr[i]+arr[i-k];
             max=Math.max(max,curr_val);
         }
         System.out.println("Jay Siya Ram"+max);

    }
}
