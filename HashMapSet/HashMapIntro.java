import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapIntro {
    public static void main(String[] args) {
        HashMap<String,Integer> m=new HashMap<String,Integer>();
        m.put("a",10);
        m.put("b",11);
        m.put("c",12);
        System.out.println(m);
        System.out.println(m.size());

//        loop only on keyset of hashmap
//        T.C for both methods O(1)
        Set<String> keys=m.keySet();//these will return only keys
        System.out.println(keys);
        for(String k:keys){
            System.out.println("key: "+k+",value:"+m.get(k));
        }
        System.out.println("another method to iterate in hashmap");
        for(Map.Entry<String,Integer>e:m.entrySet()){//entryset method  to return both both
            System.out.println(e.getKey()+" "+e.getValue());
        }
        m.remove("a");
//        other functions
//        remove(),containsKey(),size(),containsValue(),get(),isEmpty() etc
        if(m.containsValue(11)){
            System.out.println("yes there is 11");
        }
    }
}
