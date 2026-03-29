import  java.util.*;
class Ques_1 {
    private final int CAPACITY = 769;
    private LinkedList<Integer>[] buckets;

    public void MyHashSet() {
        buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void add(int key) {
        int index = key % CAPACITY;
        if (!buckets[index].contains(key)) {
            buckets[index].add(key);
        }
    }

    public void remove(int key) {
        int index = key % CAPACITY;
        buckets[index].remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = key % CAPACITY;
        return buckets[index].contains(key);
    }
}