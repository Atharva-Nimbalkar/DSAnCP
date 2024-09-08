package atharva.com;

import java.util.ArrayList;
import java.util.List;

public class Combinationsum3 {


    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        combinationSum(ans,new ArrayList<Integer>(),k,1,n);
        return ans;
    }

    //main function
    private static void combinationSum(List<List<Integer>>ans, List<Integer> comb, int k, int start, int n){
        if(comb.size()==k && n==0){
            //So if you just add comb to list, list will just make a pointer pointing to comb instead of making a new memory space. So if comb is modified, list will be modified too.
            //comb will continue being modified. You want to put a copy of comb in result instead
            List<Integer>li=new ArrayList<Integer>(comb);
            ans.add(li);
            return;
        }

        for(int i=start;i<=9;i++){
            comb.add(i);
            combinationSum(ans,comb,k,i+1,n-i);
            comb.remove(comb.size()-1);
        }
    }
    public static void main(String[] args) {
        int k=3;
        int n=7;
        //function call
        System.out.println(combinationSum3(k,n));
    }
}
