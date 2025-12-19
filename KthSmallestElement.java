import java.util.*;


 
public class KthSmallestElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(15);

        int k = 3; // kth smallest element

        Collections.sort(list);

        System.out.println("Kth Smallest Element: " + list.get(k - 1));
    }
}
