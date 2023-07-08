import java.util.*;
public class Hashset {
    public static void main(String args[]){
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);
        System.out.println(hs.contains(2));
        System.out.println(hs.size());
        hs.remove(2);
        System.out.println(hs);

        HashSet<String>cities=new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Gurugram");
        cities.add("Pune");
        /*Iterator it=cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next()); 
        }*/

        for(String city: cities){
            System.out.println(city);
        }
    }
}
