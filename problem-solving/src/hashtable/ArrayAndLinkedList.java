package hashtable;

public class ArrayAndLinkedList {
    private int INITIAL_SIZE = 16;
    private HashEntry[] data; // Linked list

    class HashEntry {
        String key;
        String value;
        HashEntry next;

        HashEntry(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    ArrayAndLinkedList() {
        data = new HashEntry[INITIAL_SIZE];
    }
}
//A hash table is a data structure that maps keys to values for highly efficient lookup.
//A goog implementation minimizes collision
