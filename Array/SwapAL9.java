package atharva.com;

import java.util.ArrayList;

public class SwapAL9 {
    public static void swapArrayList(ArrayList<Integer>list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        int idx1=1,idx3=3;
        swapArrayList(list,idx1,idx3);
        System.out.println(list);
    }
}
