import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetIntro {
    public static void main(String[] args) {
//        HashSet is used to reduce n factor by 1
        java.util.HashSet<String> hs=new java.util.HashSet<String>();
        hs.add("God is");
        hs.add("With");
        hs.add("You");
        System.out.println("size "+hs.size());
        System.out.println(hs);
        System.out.println(hs.remove("With"));
        System.out.println(hs.contains("God is"));
//        Iterator<String>it=hs.iterator();
//        while(it.hasNext()){//using iterator or enhanced loop u can iterate.
//            System.out.print(it.next()+" ");//this is iterator()
//        }
        System.out.println("for loop");
        for(String s:hs){//enhanced loop
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.print(hs.isEmpty());

        System.out.println();
        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("Mumbai");//order maintain
        lhs.add("Solapur");
        lhs.add("pune");
        lhs.add("Banglore");
        System.out.println(lhs);
    }
}