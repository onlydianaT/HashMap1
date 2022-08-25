public class MyMapPair<Character, Integer> {
    protected char key;
    protected int value;

    public MyMapPair(char key, int value) {
        this.key = key;
        this.value = value;
    }

    public char getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
