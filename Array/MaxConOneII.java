package atharva.com;

public class MaxConOneII {

    public static int findMaxConseutiveOne(int[] nums, int k) {
        int left=0;
        int window=0;
        int cnt=0;
        for(int right=0;right<nums.length;right++){
            window+=nums[right];
            while(window+k < right-left+1){
                window-=nums[left];
                left++;
            }
            cnt=Math.max(cnt,right-left+1);
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1};

        int ans=findMaxConseutiveOne(arr,1);
        System.out.println("anwer is "+ ans);
    }
}
