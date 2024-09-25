package school.arrayList;
import java.util.ArrayList;
import java.util.Comparator;
public class Collection01 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i = 10; i >= 1; i--) {
            num.add(i);
        }
            System.out.println(num);
            System.out.print("정렬 전 :");
            for (int i = 0; i < num.size(); i++) {
                System.out.print(num.get(i) + ",");
            }

                num.sort(Comparator.naturalOrder());
//                num.sort(Comparator.reverseOrder());
            //자연스러운 순서로 출력?

                System.out.println();
                System.out.print("정렬 후 :");
                for (int i = 0; i < num.size(); i++) {
                    System.out.print(num.get(i)+",");
                }

    }
}
