package atharva.com;

import java.util.ArrayList;

public class RevArrayList8 {
    public static void main(String[] args) {
//        ARRay list is like vector in c++;
//        it it java collection frame work
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

//       TC : O(N)
        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max=Math.max(max,list.get(i));
        }
        System.out.println();
        System.out.println("MAX : "+max);
    }
}
