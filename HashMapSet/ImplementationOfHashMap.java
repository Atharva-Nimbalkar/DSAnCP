import org.w3c.dom.Node;

import javax.print.DocFlavor;
import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

public class ImplementationOfHashMap {
    static class HashMap<K,V>{//this is generic (data type could be anything)
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;
        private int N;
        private LinkedList<Node>buckets[];//N

//        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();//intialize oneNode for each bucket
            }
        }

        private int hasFunction(K key){
            int hashcode=key.hashCode();//hascode is build in method we use abs to convert -ve value to +ve
            return Math.abs(hashcode)%N;//if dividend divided by  divisor then remainder is  alwyas less than 0 to divisor-1;
        }

        private int searchInLL(K key,int bi){
            LinkedList<Node>ll=buckets[bi];
            int LL_idx1=0;
            for(int i=0;i<ll.size();i++){
                  Node node=ll.get(i);
                  if(node.key==key){
                      return LL_idx1;
                  }
                  LL_idx1++;
            }
            return -1;
        }

        private void rehash(){//to make old data structure more optimized;
            LinkedList<Node>oldBuck[]=buckets;
            N=2*N;//make double size of our bucket
            buckets=new LinkedList[N];
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            //nodes-> add in new bucket
            for(int i=0;i<oldBuck.length;i++){
                LinkedList<Node>ll=oldBuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }
        }



        public void put(K key,V value){//o(lambda)->o(1)
            int bucket_idx=hasFunction(key);
            int LL_idx=searchInLL(key,bucket_idx);//or data_index

            if(LL_idx!=-1){
                Node node=buckets[bucket_idx].get(LL_idx);
                node.value=value;
            }
            else{
                buckets[bucket_idx].add(new Node(key,value));
                n++;

                double lambda=(double)n/N;
                if(lambda>2.0){
                    rehash();
                }
            }
        }

        public boolean containsKey(K key){//O(1)
            int bucket_idx=hasFunction(key);
            int LL_idx=searchInLL(key,bucket_idx);

            if(LL_idx!=-1){//valid
                return true;
            }
            else{
                return false;
            }
        }

        public V remove(K key){//o(1)
            int bucket_idx=hasFunction(key);
            int LL_idx=searchInLL(key,bucket_idx);

            if(LL_idx!=-1){
                Node node=buckets[bucket_idx].remove(LL_idx);
                n--;
                return node.value;
            }else{
                return null;
            }
        }


        public V get(K key){//O(1)
            int bucket_idx=hasFunction(key);
            int LL_idx=searchInLL(key,bucket_idx);

            if(LL_idx!=-1){
                Node node=buckets[bucket_idx].get(LL_idx);
                return node.value;
            }
            else{
                return null;
            }
        }

        public ArrayList<K>keySet(){
            ArrayList<K>keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node>ll=buckets[i];
                for(Node node:ll){
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpey(){
            return n==0;
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();//here we use explicitly created  class
        hm.put("India",100);
        hm.put("USA",90);
        hm.put("Nepal",5);
        hm.put("US",50);

        //we call keyset
        ArrayList<String>keys=hm.keySet();
        for(String key: keys){
            System.out.println(key);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));




    }
}
