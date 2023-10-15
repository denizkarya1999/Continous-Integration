public class secretFiles {
    public static void main(String[] args) {
        hashing hashFunction = new hashing(10);

        hashFunction.insert("Alice", "123-456-7890");
        hashFunction.insert("Bob", "987-654-3210");
        hashFunction.insert("Charlie", "555-123-4567");

        System.out.println("Alice's Phone Number: " + hashFunction.lookup("Alice"));
        System.out.println("Bob's Phone Number: " + hashFunction.lookup("Bob"));
        System.out.println("Dave's Phone Number: " + hashFunction.lookup("Dave"));
    }
}

class hashing {
    private int tableSize; // is used for getting the size for HashTable
    private String[] table; // is the HashTable

    // The constructor assigns size of the HashTable
    public hashing(int size) {
        tableSize = size;
        table = new String[tableSize];
    }

    // Get the ASCII code of each character and divide them by TableSize and return
    // the remainder
    // Worst-case time complexity: O(n)
    public int hash(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += key.charAt(i);
        }
        return sum % tableSize;
    }

    // Insert function shall get the index from hash and assign an index into an
    // array then value will be inserted into that location
    // Worst-case time complexity: O(n)
    public void insert(String key, String value) {
        int index = hash(key);
        table[index] = value;
    }

    // Key will be used to get the index and the index will return the associated
    // value
    // Worst-case time complexity: O(n)
    public String lookup(String key) {
        int index = hash(key);
        return table[index];
    }
}