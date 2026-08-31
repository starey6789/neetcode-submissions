class DynamicArray {
    private int[] array;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.array = new int[this.capacity];
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity){
            resize();
        }
        this.array[length] = n;
        length++;
     }

    public int popback() {
        --length;
        return this.array[length];
    }

    private void resize() {

        int[] newArr = new int[this.capacity*2];
        for (int i = 0; i < this.capacity; ++i){
            newArr[i] = array[i];
        }

        this.capacity *= 2;
        array = newArr;
    }

    public int getSize() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }
}
