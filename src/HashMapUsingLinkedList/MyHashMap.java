package HashMapUsingLinkedList;

public class MyHashMap<K, V> {

    private Entry<K, V>[] buckets;
    private static final int INITIAL_CAPACITY = 16;
    private int size = 0;

    public MyHashMap(){
        this.buckets = new Entry[INITIAL_CAPACITY];
    }

    private int bucketIndex(K key){
        return Math.abs(key.hashCode())%buckets.length;
    }

    public void put(K key, V value){
        int bucketIndex = bucketIndex(key);
        Entry<K, V> newEntry = new Entry<>(key, value);

        if(buckets[bucketIndex] == null){
            buckets[bucketIndex] = newEntry;
            size++;
        }else{

        }

    }


}

class Entry<K, V>{
    K key;
    V value;

    Entry<K, V> next;

    public Entry(K key, V value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
