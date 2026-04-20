public class SimpleArrayTest {
    private static final int CAPACITY = 10;

    private int theSize = 0;
    private Object[] theItems = new Object[CAPACITY];

    public int size() {
        return theSize;
    }

    public Object get(int idx) {
        if (idx < 0 || idx >= theSize) {
            throw new ArrayIndexOutOfBoundsException("Index: " + idx + ", Size: " + theSize);
        }
        return theItems[idx];
    }

    public boolean add(Object x) {
        if (theItems.length == size()) {
            Object[] old = theItems;
            theItems = new Object[theItems.length *2 +1];

            for (int i = 0; i < size(); i++) {
                theItems[i] = old[i];
            }
        }
        theItems[size()] = x;
        return true;
    }


}
