import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<String> elements = Arrays.asList("Amr", "Mido", "Nour", "Kamilia", "Ghada", "Amal", "Sayed");
        List<String> copy = new ArrayList<>(elements);
        sortJava7(elements);
        sortJava8(copy);
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
        for (String element : copy) {
            System.out.print(element + " ");
        }
    }

    private static void sortJava7(List<String> elements) {
        elements.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private static void sortJava8(List<String> elements) {
        elements.sort((s1, s2) -> s1.compareTo(s2));
    }

}
