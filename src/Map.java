import java.util.ArrayList;
import java.util.List;

public class Map<K, V> {
    protected List<MyMapPair<Character, Integer>> pairs = new ArrayList<>();

    public void put(char key, int value) {
        for (MyMapPair<Character, Integer> kv : pairs) {
            if (kv.getKey() == (key)) {
                int s = kv.getValue();
                int result = s + 1;
                kv.setValue(result);
                return;
            }
        }
        MyMapPair<Character, Integer> newKv = new MyMapPair<>(key, value);
        pairs.add(newKv);
    }

    int max = Integer.MIN_VALUE;
    char keyMax = ' ';

    public void max() {
        for (MyMapPair<Character, Integer> kv : pairs) {
            if (kv.getValue() > max) {
                max = kv.getValue();
                keyMax = kv.getKey();
                continue;
            }
        }
        System.out.println("Maximal'no v vedennom texte vstrechaetsya symbol " + keyMax + " " + max + " raz");
    }

    int min = Integer.MAX_VALUE;
    char keyMin = ' ';

    public void min() {
        for (MyMapPair<Character, Integer> kv : pairs) {
            if (kv.getValue() < min) {
                min = kv.getValue();
                keyMin = kv.getKey();
                continue;
            }
        }
        System.out.println("Minimal'no v vedennom texte vstrechaetsya symbol " + keyMin + " " + min + " raz");
    }

    public Integer get(char key) {
        for (MyMapPair<Character, Integer> kv : pairs) {
            if (kv.getKey() == (key)) {
                return kv.getValue();
            }
        }
        return null;
    }
}
