public class ArrayList {
    private int[] array;
    private int currentIndex;

    public ArrayList() {
        array = new int[10];
        currentIndex = 0;
    }

    public ArrayList(int size) {
        array = new int[size];
        currentIndex = 0;
    }

    public int get(int index) {
        if (isCorrectIndex(index)) return array[index];
        else throw new ArrayIndexOutOfBoundsException("Index " + index + "out of bounds for length " + size());
    }

    public void add(int value) {
        if (currentIndex >= array.length) {
            int[] newArray = new int[2 * array.length];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[currentIndex++] = value;
    }

    public int size() {
        return currentIndex;
    }

    public void remove(int index) {
        if (isCorrectIndex(index)) {
            if (array.length - 1 - index >= 0)
                System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
            currentIndex--;
        }  else throw new ArrayIndexOutOfBoundsException("Index " + index + "out of bounds for length " + size());
    }

    public void set(int index, int value){
        if (isCorrectIndex(index))
            array[index] = value;
        else throw new ArrayIndexOutOfBoundsException("Index " + index + "out of bounds for length " + size());
    }

    private boolean isCorrectIndex(int index){
        return index < size() && index >= 0;
    }

    public boolean isEmpty() {
        return currentIndex == 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size(); i++){
            if (i > 0)
                builder.append(", ");
            builder.append(get(i));
        }
        builder.append("]");

        return builder.toString();
    }

}