import java.util.HashMap;

//ps Find itinerary from tickets
public class FindItinerary {
    public static String findItinerary(HashMap<String,String>tickets){
        HashMap<String,String>revHashMap=new HashMap<>();
        for(String key:tickets.keySet()){
            revHashMap.put(tickets.get(key),key);
        }
        for(String key:tickets.keySet()){
            if(!revHashMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String,String >tickets=new HashMap<>();
        tickets.put("Chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("goa","chennai");
        tickets.put("delhi","goa");

        String Start=findItinerary(tickets);
        System.out.println(Start);
        for(String str:tickets.keySet()){
            System.out.println("->"+tickets.get(Start));
            Start=tickets.get(Start);
        }

        System.out.println();
    }
}
