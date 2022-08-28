import java.util.*;

public class MyMap<K, V> {
    protected List<MyMapPair<Character, Integer>> pairs = new LinkedList<>();
    protected Map<Character, Integer> mapTransformer = new HashMap<>();

    public void put(char key, int value) {
        for (MyMapPair<Character, Integer> kv : pairs) {
            if (kv.getKey() == (key)) {
                int getV = kv.getValue();
                int result = getV + 1;
                kv.setValue(result);
                mapTransformer.put(key, result);
                return;
            }
        }
        MyMapPair<Character, Integer> newKv = new MyMapPair<>(key, value);
        pairs.add(newKv);
        mapTransformer.put(key, value);
    }

    int max = Integer.MIN_VALUE;
    char keyMax = ' ';

    public void max() {
        for (char keyForEach : mapTransformer.keySet()) {
            int val = mapTransformer.get(keyForEach);
            if (val > max) {
                max = val;
                keyMax = keyForEach;
                continue;
            }
        }

        System.out.println("Maximal'no v vedennom texte vstrechaetsya symbol " + keyMax + " " + max + " raz");
    }

    int min = Integer.MAX_VALUE;
    char keyMin = ' ';

    public void min() {
        for (char keyForEach : mapTransformer.keySet()) {
            int val = mapTransformer.get(keyForEach);
            if (val < min) {
                min = val;
                keyMin = keyForEach;
                continue;
            }
        }
        System.out.println("Minimal'no v vedennom texte vstrechaetsya symbol " + keyMin + " " + min + " raz");
    }

    public Integer get(char key) {
        if (mapTransformer.containsKey(key)) {
            int v = mapTransformer.get(key);
            return v;
        }
        return null;
    }
}

