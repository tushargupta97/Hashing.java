import java.util.*;
public class LinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<String>cities= new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Gurugram");
        cities.add("Pune");
        System.out.println(cities); //same order outpput as of insertion
        //all other functions are same as hashSet
    }
}
