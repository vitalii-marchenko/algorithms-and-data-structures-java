package a_data_structures_part.g_hash_table;

public class MyMapImpl<V> {

    private int size;
    private int[] slots;
    private V[] data;

    public MyMapImpl() {
        this.size = 11;
        this.slots = new int[size];
        this.data = (V[]) new Object[size];
    }

    public int hashFunction(int key, int size) {
        return key % size;
    }

    public int rehash(int oldHash, int size) {
        return (oldHash + 1) % size;
    }

    public void put(int key, V value) {
        int hashValue = hashFunction(key, size);
        if (slots[hashValue] == 0) {
            slots[hashValue] = key;
            data[hashValue] = value;
        } else {
            if (slots[hashValue] == key) {
                data[key] = value;
            } else {
                int nextSlot = rehash(hashValue, size);
                while (slots[nextSlot] != 0 && slots[nextSlot] != key) {
                    nextSlot = rehash(nextSlot, size);
                }
            }
        }
    }

    public static void main(String[] args) {
        new MyMapImpl<String>();
        System.out.println();
    }
}
