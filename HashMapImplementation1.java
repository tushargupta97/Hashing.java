import java.util.*;


public class HashMapImplementation1 {
    static class HashMap<K,V>{ //generic =general for all datatype
        private class Node{
            K key;
            V val;
            public Node (K key , V val){
                this.key=key;
                this.val=val;
            }
        }
        private int n; //n
        private int N;
        private LinkedList<Node>buckets[]; //N=buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0; i<4;i++){
                this.buckets[i]=new LinkedList<>(); //LinkedList created=array of LL
            }
        }

        private int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc) % N ; //returns +ve value
        }
        private int searchInLL(K key , int bi){
            LinkedList<Node>ll= buckets[bi];
            int di=0;
            for(int i=0; i<ll.size();i++){
                Node node =ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuck[]=buckets;
            buckets=new LinkedList[N*2];
            N=2*N;
            for(int i=0; i<buckets.length;i++){
                buckets[i]= new LinkedList<>();
            }
            for(int i=0; i< oldBuck.length;i++){
                LinkedList<Node>ll=new LinkedList<>();
                for(int j=0; j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key, node.val);
                }
            }
        }
        @SuppressWarnings("unchecked")
        public void put(K key , V val){ //O(lambda)->O(1)
            int bi=hashFunction(key); //bucket index 0to size()-1
            int di=searchInLL(key,bi);//data index
            if(di!=-1){
                Node node=buckets[bi].get(di);
                node.val=val;
            }else{
                buckets[bi].add(new Node(key, val));
                n++;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){ //O(lambda)->O(1)
            int bi=hashFunction(key); //bucket index 0to size()-1
            int di=searchInLL(key,bi);//data index
            if(di!=-1){
                return true;
            }else{
                return false;
            }
        }

        public V remove( K key){ //O(lambda)->O(1)
            int bi=hashFunction(key); //bucket index 0to size()-1
            int di=searchInLL(key,bi);//data index
            if(di!=-1){
                Node node=buckets[bi].remove(di);
                n--;
               return node.val;
            }else{
            return null;
            }
        }
        public V get(K key){ //O(lambda)->O(1)
            int bi=hashFunction(key); //bucket index 0to size()-1
            int di=searchInLL(key,bi);//data index
            if(di!=-1){
                Node node=buckets[bi].get(di);
               return node.val;
            }else{
            return null;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys= new ArrayList<>();
            for(int i=0; i<buckets.length;i++){
                LinkedList<Node>ll=buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("India",100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        ArrayList<String> keys= hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
