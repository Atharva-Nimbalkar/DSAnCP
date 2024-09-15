public class BS4 {

    public static void main(String[] args) {
        int[] arr={1,23,45,66,33,78};
        int target=78;
        System.out.println(search(arr,target,0,arr.length-1));
    }

    static int search(int[] arr,int target,int start,int end){
//        argument that required for future reference are located inside function
        if(start>end){
            return -1;
        }
//        to avoid overflow of int data type
        int mid=start+(end-start)/2;

        if(target==arr[mid]){
//            argument not required for futre reference located inside body
            return mid;
        }
        if(target<arr[mid]){
            return search(arr,target,start,mid-1);
        }

        return search(arr,target,start+1,end);
    }
}

//For example, if s and e are both close to the maximum value of the int data type, adding them together could exceed the maximum value and cause an overflow, leading to unexpected behavior or incorrect results.
//To avoid this issue and ensure that the mid index calculation doesn't cause an overflow, we use the formula (s + (e - s)) / 2,