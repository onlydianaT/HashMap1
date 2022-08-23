import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. " +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi " +
                "ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
                " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur " +
                "sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit" +
                " anim id est laborum.";

        String[] parts = text.split("");
        char[] text1 = new char[parts.length];

        // String [] letter =text.split("");
        for (int i = 0; i < parts.length; i++) {
            char c = text.toLowerCase().charAt(i);
            text1[i] = c;
        }
        //System.out.println(Arrays.toString(text1));
        //List<MyMapPair<Character,Integer>> list = new ArrayList<>();
        //Set<Character>set=new HashSet<>();


//
//        for (int i=0;i<text1.length;i++){
//
//            set.add(text1[i]);
//        }
//        System.out.println(set);
//
//        char[] myArray = {};
//        myArray = set.toArray(new char [set.size()]);
//        int[]count=new int[myArray.length];

//        for (int i=0;i<text1.length;i++){
//            for (int j=0;j<myArray.length;j++){
//
//                if(myArray[j]==text1[i]){
//               count[j]++;
//            }}
//
//
//            }
        //System.out.println(Arrays.toString(count));
        Map<Character, Integer> map = new Map<>();

        for (int i = 0; i < text1.length; i++) {
            if (text1[i] == ' ' || text1[i] == '.') {
                continue;
            } else {
                map.put(text1[i], 1);
            }
        }

//         for (int j=0;j<myArray.length;j++) {
//
//             for (int i=0;i<count.length;i++) {
//                 i=j;
//              map.put(myArray[j], count[i]);
//break;
//
//                     }
//             }

        map.max();
        map.min();
        System.out.println("Zaproshennii symbol vstrechaetsya v texte " + map.get('x') + " raz");


    }
}
