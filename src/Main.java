import java.util.*;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
            "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
            "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
            " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
            "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit" +
            " anim id est laborum.";

    public static void main(String[] args) {

        String[] parts = text.split("");
        char[] text1 = new char[parts.length];

        for (int i = 0; i < parts.length; i++) {
            char c = text.toLowerCase().charAt(i);
            text1[i] = c;
        }

        MyMap<Character, Integer> map = new MyMap<>();

        for (int i = 0; i < text1.length; i++) {
            if (text1[i] == ' ' || text1[i] == '.') {
                continue;
            } else {
                map.put(text1[i], 1);
            }
        }
        map.max();
        map.min();
        System.out.println("Zaproshennii symbol vstrechaetsya v texte " + map.get('x') + " raz");

    }
}
