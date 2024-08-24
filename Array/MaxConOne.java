package atharva.com;

//Given a binary array nums, return the maximum number of consecutive 1's in the array.
public class MaxConOne {

    public static int findMaxConseutiveOne(int[] nums) {
        int left=0;//only moves if there is zero
        int window=0;
        int cnt=0;
        for(int right=0;right<nums.length;right++){
            window+=nums[right];
            while(right-left+1!=window){
                //basically size of window is equal to max one at present
                window-=nums[left];
                left++;
            }
            cnt=Math.max(cnt,right-left+1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1};

        int ans=findMaxConseutiveOne(arr);
        System.out.println("anwer is "+ ans);

    }
}
