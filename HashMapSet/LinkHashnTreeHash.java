import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkHashnTreeHash {
    public static void main(String[] args) {
//        insertion is sorted
//        Data stru: DLL
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("USA",80);
        lhm.put("UK",120);
        lhm.put("Nepal",90);

        System.out.println("Order maintain");
        System.out.println(lhm);

        System.out.println("Order doesnt maintain");
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("USA",80);
        hm.put("UK",120);
        hm.put("Nepal",90);

        System.out.println(hm);

        System.out.println("Order maintained as per alphabetical order");
        TreeMap<String,Integer>thm=new TreeMap<String, Integer>();
        thm.put("India",100);
        thm.put("USA",80);
        thm.put("UK",120);
        thm.put("Nepal",90);
        System.out.println(thm);


    }
}
