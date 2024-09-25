package school.arrayList;
import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Collection05 {
    public static void main(String[] args) {
        TreeSet<String> str = new TreeSet<String>();
//        TreeSet<String> str = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);

        str.add("apple");
        str.add("Bannna");
        str.add("Car");
        System.out.println(str);



        System.out.print("TreeSet 요소: ");
        for (String elements : str) {
            System.out.print(elements + " ");
        }
        String[] array = new String[str.size()];
        str.toArray(array);

        System.out.println();
        System.out.print("Array요소 : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}