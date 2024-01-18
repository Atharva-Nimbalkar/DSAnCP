import java.util.HashMap;
import java.util.Set;
//PS:229. Majority Element II
// optimal approach : also by boyer moore voting algo
public class MajorityElement {
    public static void main(String[] args) {
//        TC: O(N)
        HashMap<Integer,Integer>map=new HashMap<>();
        int nums[]={1,3,2,5,1,3,1,5,1};
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            //shorthand getOrDefault method
//            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
//        Set<Integer>keySet=map.keySet();//keySet is inbuilt method
//        instead of storing keys in set  we use it in loop
//        for(Integer i: keySet){
        for(Integer i: map.keySet()){
            if(map.get(i)>(nums.length/3)){
                System.out.println(i);
            }
        }
    }

}
