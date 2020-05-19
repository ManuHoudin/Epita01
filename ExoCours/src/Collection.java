import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.sort;
import static java.util.Comparator.naturalOrder;

public class Collection {

    static Set<String> newSet = new HashSet<>();
    static Map newMap = new HashMap();
    static List<Integer> newList = new ArrayList<>();
    static TreeSet<String> newListChar = new TreeSet<>();
    static List<String> newListString = new ArrayList<>();
    static ArrayList newArray = new ArrayList();

    public static void main(String[] args) {
        newSet.add("25");
        newSet.add("La foi");
        System.out.println(newSet);

        newMap.put("&", "La foi");
        newMap.put("!", "La liberté");
        System.out.println(newMap);

        //newList.add("Gargouille");
        newList.add(25);

        newListChar.add("Troisième");
        newListChar.add("Premier");
        newListChar.add("Deuxième");
        System.out.println(newListChar);

        newListString.add("Troisième");
        newListString.add("Premier");
        newListString.add("Deuxième");
        afficher(newListString);

        newArray.add(12,"4");
        newArray.add(8,"45");
        newArray.add(24,"48");
        System.out.println(newArray);
    }
    public static void afficher(List listeString) {
        Collections.sort(listeString);
        System.out.println(listeString);

    }
}
