import java.util.HashMap;
import java.util.Set;
public class MajorityElement {
    public static void main(String[] args) {
        int arr[]={1,3,5,1,2,3,1,5,1};
        HashMap<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int num =arr[i];
            /*if(hm.containsKey(num)){
                hm.put(num, hm.get(num)+1);
            }else{
                hm.put(num, 1);
            }*/
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        //Set<Integer>keySet=hm.keySet();
        for (Integer num : hm.keySet()) {
           if(hm.get(num)>arr.length/3){
            System.out.println(num);
           } 
        }

    }
}
