import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaces {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        System.out.println("Print all numbers: ");
        evaluate(list, n -> true);

        System.out.println("Print even numbers : ");
        evaluate(list, n -> n % 2 == 0);

        System.out.println("Print odd numbers : ");
        evaluate(list, n -> n % 2 == 1);

        System.out.println("Print numbers greater than 3 : ");
        evaluate(list, n -> n > 3);
    }

    private static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (int num : list) {
            if (predicate.test(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

}
