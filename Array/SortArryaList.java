package atharva.com;

import java.util.ArrayList;
import java.util.Collections;

public class SortArryaList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(55);
        list.add(13);
        list.add(14);
        list.add(15);
//        like array has Arrays class to sort
//        same to arraylist has Collection
        Collections.sort(list);//ascending order by default
        System.out.println(list);
        System.out.println();
        Collections.sort(list, Collections.reverseOrder());//2nd argument is Comparator function
        System.out.print(list);
    }
}
