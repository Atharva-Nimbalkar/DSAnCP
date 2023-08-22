package atharva.com;

import java.util.ArrayList;
import java.util.Scanner;

//Q: 1D array
public class ArrayListExamples5 {
    //syntax // note: integer is (wrap class)
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>(5);
//
//        arr.add(123);
//        arr.add(345);
//        arr.add(12678);
//        arr.add(900);
//        arr.add(98989);
//        arr.add(23);
//
//        System.out.println(arr.contains(23));
//        arr.set(0,1777);
//        System.out.println(arr);

        Scanner input=new Scanner(System.in);

        //input
        for(int i=0;i<5;i++){
            arr.add(input.nextInt());
        }

//        get item at  any index
        for(int i=0;i<5;i++){
            System.out.println(arr.get(i));//pass index here,arr[index] syntax will not work here
        }

        System.out.println(arr);
    }
}
