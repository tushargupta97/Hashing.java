import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,2,9,4,9};
        //union={7,3,9,2,4,6}=6
        //intersection={3,6}=2
        HashSet<Integer>hs=new HashSet<>();

        //union
        for(int i=0; i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0; i<arr2.length;i++){
            hs.add(arr2[i]);
            
        }
        
        System.out.println("union="+hs.size());
        System.out.println(hs);
        //intersection
        hs.clear();
        for(int i=0; i<arr1.length;i++){
            hs.add(arr1[i]);  
        }
       
        int count=0;
        for(int i=0; i<arr2.length;i++){
           if(hs.contains(arr2[i])){
            count++;
            hs.remove(arr2[i]);    
           }
        }
        //System.out.println();
        System.out.println("intersection="+count);
    }
}
