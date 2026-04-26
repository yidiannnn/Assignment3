public class Building {
    private String name;
    private int capacity;


    public Building(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }

    public void print() {
        System.out.println("Building: " + name + ", capacity=" + capacity);
    }
}

