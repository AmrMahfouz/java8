import java.time.LocalTime;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Amr", "Mido", "Nour", "", "Kamilia", "Ghada", "Amal", "");

        System.out.print("Total List : ");
        strings.forEach(s -> System.out.print(s + " "));
        System.out.println();

        List<String> nonEmptyStrings = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.print("Non Empty List : ");
        nonEmptyStrings.forEach(s -> System.out.print(s + " "));
        System.out.println();

        Random random = new Random();
        System.out.print("10 Random Numbers : ");
        random.ints().limit(10).forEach(r -> System.out.print(r + " "));
        System.out.println();

        System.out.println("Adding suffix and prefix to the list : ");
        strings.stream().map(s -> "prefix " + s + " suffix ").forEach(System.out::println);
        System.out.println();

        System.out.print("Print squares of num list : ");
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream().map(i -> i * i).forEach(s -> System.out.print(s + " "));
        System.out.println();

        long count = strings.stream().filter(s -> s.isEmpty()).count();
        System.out.println("Count of empty strings " + count);

        System.out.print("Sort numbers : ");
        Arrays.asList(9,2,5,6,1,1,5,1,2,5,6,5).stream().sorted().forEach(n -> System.out.print(n + " "));
        System.out.println();

        String result = strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(","));
        System.out.println("Join not empty strings with comma : " + result);
        System.out.println();

        IntSummaryStatistics stringsLengthStatistics = strings.stream().mapToInt(n -> n.length()).summaryStatistics();
        System.out.println("Average : " + stringsLengthStatistics.getAverage());
        System.out.println("Max : " + stringsLengthStatistics.getMax());
        System.out.println("Min : " + stringsLengthStatistics.getMin());
        System.out.println("Sum : " + stringsLengthStatistics.getSum());
        System.out.println();

        System.out.println("Difference between parallel and sequential streams : ");
        System.out.println("Sequential stream : ");
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream().forEach(n -> System.out.println(LocalTime.now() + " - value " + n + ", thread : " + Thread.currentThread().getName()));
        System.out.println();
        System.out.println("Parallel stream : ");
        Arrays.asList(1,2,3,4,5,6,7,8,9).stream().parallel().forEach(n -> System.out.println(LocalTime.now() + " - value " + n + ", thread : " + Thread.currentThread().getName()));
    }

}
