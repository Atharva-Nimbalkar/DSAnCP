import java.util.HashMap;

public class SubArraySumk {

    public static void main(String[] args) {
        int arr[]={10,2,-2,-20,10};
        int k=-10;
        HashMap<Integer,Integer>hm=new HashMap<>();
        int sum=0;
        int fre=0;

        hm.put(0,1);

        for(int j=0;j< arr.length;j++){//tc: O(n)
            sum+=arr[j];
            if(hm.containsKey(sum-k)){
                fre+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(fre);
    }
}
