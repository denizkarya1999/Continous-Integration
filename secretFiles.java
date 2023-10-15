public class secretFiles {
    public static void main(String[] args) {
        hashing hashFunction = new hashing(6);

        hashFunction.insert("11", "Operation Thunder on the Desert");
        hashFunction.insert("12", "Operation Liberating Dreams");
        hashFunction.insert("13", "Operation Beach Holiday");
        hashFunction.insert("14", "Operation Coke Kid");
        hashFunction.insert("15", "Operation Alan Turing");

        System.out.println("Islamist Purge of 2022: " + hashFunction.lookup("11"));
        System.out.println("DV2023 Application: " + hashFunction.lookup("12"));
        System.out.println("Hackathons in Turkey: " + hashFunction.lookup("13"));
        System.out.println("Passing Calculus 2: " + hashFunction.lookup("14"));
        System.out.println("Integration of LGBT with Karya: " + hashFunction.lookup("15"));
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