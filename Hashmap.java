import java.util.HashMap;
import java.util.Set;
public  class Hashmap{
    public static void main(String[] args) {
       HashMap<String , Integer> hm= new HashMap<>();
       hm.put("India", 100);
       hm.put("china", -20);
       hm.put("Indonasia", 20);
       System.out.println(hm);

       System.out.println(hm.size()); 

       int pop= hm.get("India");

       System.out.println(pop);

       System.out.println(hm.containsKey("US"));

       System.out.println(hm.remove("china"));

       System.out.println(hm);

       System.out.println(hm.size()); 

       System.out.println(hm.isEmpty());

       System.out.println();

       //hm.clear();

       System.out.println(hm);

       //Iterate
       Set<String> keys=hm.keySet();
       System.out.println(keys); //These keys can be printed in any sorted order
       System.out.println();
       
       for (String k : keys) {
        System.out.println("key="+k+",value="+hm.get(k));
       }
    }
}