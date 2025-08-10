import java.util.Arrays;

public class DinamicArray {
    private String[] item;
    private int capacity;
    private int count;

    public DinamicArray() {
        item = new String[10];
        capacity = 10;
    }

    public DinamicArray (int capacity) {
        this.capacity = capacity;
        item = new String[capacity];
    }

    public int getCount() {
        return count;
    }

    public String[] getItems () {
        return item;
    }

    public String getItem (int index) {
        return item[index];
    }

    public void add (String refItem) {
        ++count;
        if (count > capacity) {
            capacity += 10;
            item = Arrays.copyOf(item, capacity);
        }
        item[count - 1] = refItem;
    }
}
